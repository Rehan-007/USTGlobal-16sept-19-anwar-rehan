package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;

public class DeleteDemo {

	public static void main(String[] args) {
		
		EntityManager em = null;
		EntityTransaction et = null;
		
		try {
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			et = em.getTransaction();
			et.begin();
			
			Product p = em.find(Product.class, 101);
			em.remove(p);
			
			System.out.println("Updated Record");
			et.commit();
			
		} catch(Exception e) {
			e.printStackTrace();
			et.rollback();
		}
		
		em.close();
	}
	
}
