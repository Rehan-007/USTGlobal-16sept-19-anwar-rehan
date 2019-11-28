package com.ustglobal.hibernateproject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.hibernateproject.dto.Student;

public class InsertStudent {

	public static void main(String[] args) {

		Student s = new Student();
		s.setSid(101);
		s.setSname("Priya");
		s.setRoll(61);

		EntityManager em = null;
		EntityTransaction et = null;

		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			et = em.getTransaction();
			et.begin();
			em.persist(s);
			System.out.println("Data Inserted Succesfully");
			et.commit();


		} catch (Exception e) {
			e.printStackTrace();
		}

		em.close();
		
	}


}
