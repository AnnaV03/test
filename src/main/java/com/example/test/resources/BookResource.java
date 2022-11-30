package com.example.test.resources;


import com.example.test.entities.Book;
import com.example.test.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/book")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class BookResource {

    private final BookService bookService;

    @Autowired
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
    @Path("/save")
    public Response saveBook(Book book) {
        return Response.ok().entity(bookService.save(book)).build();
    }

    @DELETE
    @Path("/delete/{id}")
    public Response deleteById(@PathParam("id") Long id) {
        bookService.deleteById(id);
        return Response.ok().build();
    }

}
