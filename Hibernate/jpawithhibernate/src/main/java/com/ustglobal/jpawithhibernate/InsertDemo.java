package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;

public class InsertDemo {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.setPid(102);
		product.setPname("Book");
		product.setQuantity(10);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(product);
		System.out.println("Record Saved Succesfully");
		et.commit();
		em.close();
		
	} //End OF Main Method
	
}//End Of InsertDemo
