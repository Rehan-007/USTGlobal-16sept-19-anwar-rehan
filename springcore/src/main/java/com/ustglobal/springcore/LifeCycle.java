package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.di.Book;
import com.ustglobal.springcore.di.Hello;

public class LifeCycle {

	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Hello hello = context.getBean(Hello.class);
		System.out.println(hello.getMsg());
	    context.close();	
	    
	    ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("books.xml");
	    Book book = context1.getBean(Book.class);
	    System.out.println(book.getName());
	    System.out.println(book.getPrice());
	    context1.close();
	}
	
}
