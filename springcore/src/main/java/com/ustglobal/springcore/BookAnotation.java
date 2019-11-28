package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore.config.BookConfiguration;
import com.ustglobal.springcore.di.Book;

public class BookAnotation {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(BookConfiguration.class);
		Book book = context.getBean(Book.class);
		System.out.println(book.getName());
		System.out.println(book.getPrice());
		System.out.println();
		
	}
	
}
