package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.client.BookClient;
import com.test.entity.Book;

@RestController
public class BookController {

	@Autowired
	private BookClient client;
	
	@GetMapping("/list")
	public List<Book> getAllBooks(){
		return client.listAllBooks();
	}
}
