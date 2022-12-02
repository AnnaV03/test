package com.example.test.services;

import com.example.test.entities.Book;
import com.example.test.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllByAuthorId(Long id){
        return bookRepository.findAllByAuthorId(id);
    }

    public List<Book> getAllByTitle(String title) {
        return bookRepository.findAllByTitle(title);
    }

    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }

    public Book save(Book book) {
        return bookRepository.save(book);
    }
}
