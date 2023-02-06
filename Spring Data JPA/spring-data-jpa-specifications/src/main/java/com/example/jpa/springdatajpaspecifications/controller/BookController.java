package com.example.jpa.springdatajpaspecifications.controller;

import com.example.jpa.springdatajpaspecifications.model.Book;
import com.example.jpa.springdatajpaspecifications.repository.BookRepository;
import com.example.jpa.springdatajpaspecifications.service.BookService;
import com.example.jpa.springdatajpaspecifications.specifications.BookSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/add")
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    @GetMapping("/all")
    public List<Book> findAllBooks() {
        return bookService.findAllBooks();
    }

    @GetMapping("/pub/{author}/all")
    public List<Book> findAllBooksByAuthor(@PathVariable("author") String author) {
        return bookService.findAllBooksByAuthor(author);
    }

    @GetMapping("/search/{title}")
    public List<Book> findBookByTitle(@PathVariable("title") String title) {
        return bookService.findBookByTitle(title);
    }
}
