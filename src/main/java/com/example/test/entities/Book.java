package com.example.test.entities;

import javax.annotation.Generated;
import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "Books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id", nullable = false)
    private Long id;

    @Column(name = "Author", nullable = false)
    private String author;

    @Column(name = "ISBN", nullable = false, length = 13)
    private String isbn;

    @Column(name = "Title", nullable = false)
    private String title;

    @Column(name = "Year", nullable = false, length = 4)
    private String year;

    @Column(name = "Genre", nullable = false)
    private String genre;

    @Column(name = "Date", nullable = false)
    private LocalTime date;



    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public LocalTime getDate() {
        return date;
    }

    public void setDate(LocalTime date) {
        this.date = date;
    }
}
