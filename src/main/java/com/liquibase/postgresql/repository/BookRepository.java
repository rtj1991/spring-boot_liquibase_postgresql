package com.liquibase.postgresql.repository;

import com.liquibase.postgresql.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {

}
