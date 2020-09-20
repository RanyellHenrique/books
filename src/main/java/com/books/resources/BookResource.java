package com.books.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.books.entities.Book;
import com.books.repositories.BookRepository;

@RestController
@RequestMapping(value = "/books")
public class BookResource {
	
	@Autowired
	private BookRepository repository;

	@GetMapping
	public List<Book> findAll() {
		return repository.findAll();
	}
}
