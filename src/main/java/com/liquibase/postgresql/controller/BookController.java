package com.liquibase.postgresql.controller;

import java.util.List;

import com.liquibase.postgresql.repository.BookRepository;
import com.liquibase.postgresql.model.Book;
import com.liquibase.postgresql.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/getbooks")
    public List<Book> getAllBooks() {
        List<Book> books=bookService.findAllBooks();
        return books;
    }
}
