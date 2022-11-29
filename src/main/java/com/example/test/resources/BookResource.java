package com.example.test.resources;


import com.example.test.services.BookService;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/book")
public class BookResource {

    private final BookService bookService;

    public BookResource(BookService bookService) {
        this.bookService = bookService;
    }

    @GET
    @Path("/find/byAuthorId/{authorId}")
    public Response findByAuthorId(@PathParam("authorId") Long authorId) {
       return Response.status(Response.Status.OK).entity(bookService.getAllByAuthorId(authorId)).build();
    }

    @GET
    @Path("/all")
    public String getAllBooks() {
        return "У нас все получилось";
    }

    @POST
    @Path("post")
    public String postBook() {
        return "У меня получилось";
    }
}
