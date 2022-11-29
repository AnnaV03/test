package com.example.test.resources;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/author")
public class AuthorResource {

    @GET
    @Path("/all")
    public String getAllAuthors() {
        return "Что-то получилось";
    }

    @POST
    @Path("/post")
    public String postAuthor() {
        return "Что-то ещё получилось";
    }
}
