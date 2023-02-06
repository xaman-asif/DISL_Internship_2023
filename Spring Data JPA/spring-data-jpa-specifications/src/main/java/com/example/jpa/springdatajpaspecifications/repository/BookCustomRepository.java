package com.example.jpa.springdatajpaspecifications.repository;

import com.example.jpa.springdatajpaspecifications.model.Book;

import java.util.List;

public interface BookCustomRepository {
    List<Book> findBooksByAuthorNameAndTitle(String author, String title);
}
