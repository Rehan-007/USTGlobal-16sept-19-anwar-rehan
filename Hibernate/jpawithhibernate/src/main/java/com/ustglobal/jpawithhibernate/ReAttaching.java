package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;

public class ReAttaching {

	public static void main(String[] args) {
		
		EntityManager em = null;
		EntityTransaction et = null;
		
		try {
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			et = em.getTransaction();
			et.begin();
			Product p = em.find(Product.class, 102);
			System.out.println(em.contains(p));
			em.detach(p);
			System.out.println(em.contains(p));
			Product p1 =  em.merge(p); //
			p1.setPname("Pen");
			System.out.println("Record Updated Succesfully");
			et.commit();
			
		} catch(Exception e) {
			e.printStackTrace();
			et.rollback();
		}
		
		em.close();
	}
	
}
