package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;

public class GetRefference {

	public static void main(String[] args) {


		EntityManager  em = null;
		EntityTransaction et = null;

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		em = emf.createEntityManager();
		
		Product p = em.getReference(Product.class, 102);
//		System.out.println(p.getClass()); will print the fully qualified class name

		System.out.println(p.getPid());
		System.out.println(p.getPname());
		System.out.println(p.getQuantity());

		em.close();

	}

}
