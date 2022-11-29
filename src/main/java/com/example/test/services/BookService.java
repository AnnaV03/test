package com.example.test.services;

import com.example.test.entities.Book;
import com.example.test.repositories.BookRepository;
import org.jvnet.hk2.annotations.Service;

import java.util.List;

@Service
public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllByAuthorId(Long id){
        return bookRepository.findAllByAuthorId(id);
    }
}
