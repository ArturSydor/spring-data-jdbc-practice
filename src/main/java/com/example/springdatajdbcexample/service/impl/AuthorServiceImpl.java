package com.example.springdatajdbcexample.service.impl;

import com.example.springdatajdbcexample.model.Author;
import com.example.springdatajdbcexample.repository.AuthorRepository;
import com.example.springdatajdbcexample.service.AuthorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Slf4j
@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public Set<Author> viewAllAuthors() {
        log.debug("Start retrieving all authors.");
        Iterable<Author> allAuthors = authorRepository.findAll();
        Set<Author> result = new LinkedHashSet<>();
        allAuthors.forEach(result::add);
        log.info("Found {} authors", result.size());
        return result;
    }

    @Override
    public void addAuthor(Author newAuthor) {
        Objects.requireNonNull(newAuthor);
        log.info("Saving new author: {}", newAuthor);
        authorRepository.save(newAuthor);
    }
}
