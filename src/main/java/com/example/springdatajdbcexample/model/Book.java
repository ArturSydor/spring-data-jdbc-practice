package com.example.springdatajdbcexample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.NotNull;

@Table("books")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    private Long id;

    @NotNull
    @Length(max = 255)
    private String name;

    @Length(max = 1024)
    private String description;
}
