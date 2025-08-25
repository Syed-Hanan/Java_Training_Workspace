package com.sutherland.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sutherland.library.entity.Book;
import com.sutherland.library.repo.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	@Autowired
	BookRepository repo;
	@Override
	public void addBook(Book book) {
		repo.save(book);		
	}

}
