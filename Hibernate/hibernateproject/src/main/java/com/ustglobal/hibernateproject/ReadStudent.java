package com.ustglobal.hibernateproject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.hibernateproject.dto.Student;

public class ReadStudent {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		
		Student s = em.find(Student.class, 101);
		System.out.println("Id = "+s.getSid());
		System.out.println("Name = "+s.getSname());
		System.out.println("Roll = "+s.getRoll());
		em.close();
		
	}

}
