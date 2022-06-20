package com.liquibase.postgresql.service;

import com.liquibase.postgresql.model.Book;

import java.util.List;

public interface BookService {
    List<Book> findAllBooks();
}
