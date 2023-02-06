package com.example.jpa.springdatajpaspecifications.specifications;

import com.example.jpa.springdatajpaspecifications.model.Book;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@Component
public class BookSpecification {
    public static Specification<Book> hasAuthor(String author) {
        return ((root, criteriaQuery, criteriaBuilder) -> {
            return criteriaBuilder.equal(
                    root.get("author"),
                    author
            );
        });
    }

    public static Specification<Book> titleContains(String title) {
        return (((root, criteriaQuery, criteriaBuilder) -> {
            return criteriaBuilder.like(
                    root.get("title"),
                    "%" + title + "%"
            );
        }));
    }
}
