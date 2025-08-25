package com.sutherland.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sutherland.library.entity.Book;
import com.sutherland.library.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	BookService service;
	
	@PostMapping
	public String addBook(@RequestBody Book book) {
		service.addBook(book);
		return "book inserted";
	}
}
