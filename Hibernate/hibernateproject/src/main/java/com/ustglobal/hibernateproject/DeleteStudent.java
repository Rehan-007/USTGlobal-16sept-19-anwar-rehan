package com.ustglobal.hibernateproject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.hibernateproject.dto.Student;


public class DeleteStudent {

	public static void main(String[] args) {
		
		EntityManager em =null;
		EntityTransaction et = null;
		try {
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			et = em.getTransaction();
			et.begin();
			
			Student s = em.find(Student.class, 101);
			em.remove(s);
			
			System.out.println("Updated Record");
			et.commit();
			
		} catch(Exception e) {
			e.printStackTrace();
			et.rollback();
		}
		
		em.close();
	}
	
	
}
	

