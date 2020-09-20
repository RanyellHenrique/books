package com.books.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.books.entities.Book;

public interface BookRepository  extends JpaRepository<Book, Long>{

}
