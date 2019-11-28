package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;

public class ReadDemo {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		Product p = em.find(Product.class, 101); // Used to Retrive Data From DB
		System.out.println("ID ="+p.getPid());
		System.out.println("Name ="+p.getPname());
		System.out.println("Quantity ="+p.getQuantity());
		em.close();
		
	}//End Of Main Menthod
	
}//End OF Class ReadDemo
