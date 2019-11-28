package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.di.Book;

public class BookApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("books.xml");
		Book book = context.getBean(Book.class);
		System.out.println(book.getName());
		System.out.println(book.getPrice());
		System.out.println(book.getAuthor().getName());
		System.out.println(book.getAuthor().getPname());
		System.out.println(book);
		book.init();
		book.destroy();
		
		Book book1 = context.getBean(Book.class);
		System.out.println(book1.getName());
		System.out.println(book1.getPrice());
		System.out.println(book1.getAuthor().getName());
		System.out.println(book1.getAuthor().getPname());
		System.out.println(book1);
		book1.init();
		book1.destroy();
		context.close();
	}
	
}
