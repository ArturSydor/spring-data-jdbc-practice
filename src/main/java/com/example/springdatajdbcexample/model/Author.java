package com.example.springdatajdbcexample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.NotNull;
import java.util.Set;

@Data
@Table("authors")
@NoArgsConstructor
@AllArgsConstructor
public class Author {

    @Id
    private Long id;

    @NotNull
    @Length(max = 255)
    private String firstName;

    @NotNull
    @Length(max = 255)
    private String lastName;

    @NotNull
    private Integer age;

    @NotNull
    private Integer awardsNumber;

    @MappedCollection(idColumn = "author_id")
    private Set<Book> books;
}
