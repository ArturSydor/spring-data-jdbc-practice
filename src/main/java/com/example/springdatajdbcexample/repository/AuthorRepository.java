package com.example.springdatajdbcexample.repository;

import com.example.springdatajdbcexample.model.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
