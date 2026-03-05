package com.test.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.test.entity.Book;

@FeignClient(
			name="SpringBootRestAPI",
			url="http://localhost:3467"
		)
public interface BookClient {

	@GetMapping("/list")
	public List<Book> listAllBooks();
}
