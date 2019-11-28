package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.Book;

@Configuration
public class BookConfiguration {

	@Bean(name="book")
	public Book getBook() {
		Book book =  new Book();
		book.setName("Half Girlfriend");
		book.setPrice(1200);
		return book;
	}
	
}
