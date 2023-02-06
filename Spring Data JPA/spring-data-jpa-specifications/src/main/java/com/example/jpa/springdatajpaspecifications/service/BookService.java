package com.example.jpa.springdatajpaspecifications.service;

import com.example.jpa.springdatajpaspecifications.model.Book;
import com.example.jpa.springdatajpaspecifications.repository.BookRepository;
import com.example.jpa.springdatajpaspecifications.specifications.BookSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public List<Book> findAllBooksByAuthor(@PathVariable("author") String author) {
        return bookRepository.findAll(Specification.where(BookSpecification.hasAuthor(author)));
    }

    public List<Book> findBookByTitle(@PathVariable("title") String title) {
        return bookRepository.findAll(BookSpecification.titleContains(title));
    }
}
