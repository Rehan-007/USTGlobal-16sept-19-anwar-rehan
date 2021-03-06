package com.ustglobal.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.di.Cat;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

public class XMLComponentMain {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Hello hello = context.getBean(Hello.class);
		hello.setMsg("Jai Hind Doston");
		System.out.println(hello.getMsg());
		
		Pet pet = context.getBean(Pet.class);
		pet.setName("Scooby");
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
		
	}
	
}
