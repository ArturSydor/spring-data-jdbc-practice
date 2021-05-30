package com.example.springdatajdbcexample.service;

import com.example.springdatajdbcexample.model.Author;

import java.util.Set;

public interface AuthorService {

    Set<Author> viewAllAuthors();

    void addAuthor(Author newAuthor);
}
