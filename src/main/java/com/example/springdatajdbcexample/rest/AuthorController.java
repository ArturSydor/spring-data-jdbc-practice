package com.example.springdatajdbcexample.rest;

import com.example.springdatajdbcexample.model.Author;
import com.example.springdatajdbcexample.service.AuthorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Set;

@RestController
@RequestMapping("/authors")
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorService authorService;

    @GetMapping
    public Set<Author> getAllAuthors() {
        return authorService.viewAllAuthors();
    }

    @PostMapping
    public void saveAuthor(@RequestBody @Valid Author newAuthor) {
        authorService.addAuthor(newAuthor);
    }
}
