package com.onlinebookstore.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinebookstore.demo.entity.Book;
import com.onlinebookstore.demo.repository.BookRepository;

@RestController
@RequestMapping("/api/books")
@CrossOrigin(origins = "http://localhost:3000")

public class BookController {
	
	@Autowired
	private BookRepository bookRepository;
	
	@GetMapping
	public List<Book> getAllBooks(){
		return bookRepository.findAll();
	}
	
	@PostMapping
	public Book createBook(@RequestBody Book book) {
		return bookRepository.save(book);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id){
		bookRepository.deleteById(id);
	}
}
