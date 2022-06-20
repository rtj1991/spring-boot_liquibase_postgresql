package com.liquibase.postgresql.service;

import com.liquibase.postgresql.model.Book;
import com.liquibase.postgresql.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.*;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class BookServiceImpl implements BookService{
@Autowired
private BookRepository bookRepository;

    @Override
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }
}
