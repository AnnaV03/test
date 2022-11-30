package com.example.test.resources;

import com.example.test.entities.Author;
import com.example.test.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/author")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AuthorResource {
    private final AuthorService authorService;

    @Autowired
    public AuthorResource(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GET
    @Path("/all")
    public String getAllAuthors() {
        return "Что-то получилось";
    }

    @POST
    @Path("/save")
    public Response saveAuthor(Author author) {
        return Response.ok().entity(authorService.save(author)).build();
    }

    @DELETE
    @Path("/delete/{id}")
    public Response deleteById(@PathParam("id") Long id) {
        authorService.deleteById(id);
        return Response.ok().build();
    }
}
