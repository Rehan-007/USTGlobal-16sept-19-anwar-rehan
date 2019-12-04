package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore.config.ConfigurationClass;
import com.ustglobal.springcore.di.Animal;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

public class AnnotationApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		Hello hello = context.getBean(Hello.class);
		System.out.println(hello.getMsg());
		System.out.println(hello);
		
		Hello hello2 = context.getBean(Hello.class);
		System.out.println(hello2.getMsg());
		System.out.println(hello2);
		
		System.out.println("**************Animal******************");
		//Animal animal = context.getBean(Animal.class);
		//animal.makeSound();
		
		System.out.println("***********Pet****************");
		Pet pet = context.getBean(Pet.class);
	    System.out.println(pet.getName());
	    pet.getAnimal().makeSound();
	    
	    System.out.println("************");
	    
	    context.close();
	}
	
}
