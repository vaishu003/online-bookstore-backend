package com.onlinebookstore.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinebookstore.demo.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
