package com.example.jpa.springdatajpaspecifications.repository;

import com.example.jpa.springdatajpaspecifications.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

public class BookCustomRepositoryImpl implements BookCustomRepository {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Book> findBooksByAuthorNameAndTitle(String authorName,
                                                    String title) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Book> criteriaQuery = criteriaBuilder.createQuery(Book.class);

        Root<Book> book = criteriaQuery.from(Book.class);

        Predicate authorNamePredicate = criteriaBuilder.equal(book.get("author"), authorName);
        Predicate titlePredicate = criteriaBuilder.like(book.get("title"), "%" + title + "%");

        criteriaQuery.where(authorNamePredicate, titlePredicate);

        TypedQuery<Book> query = entityManager.createQuery(criteriaQuery);
        return query.getResultList();
    }
}
