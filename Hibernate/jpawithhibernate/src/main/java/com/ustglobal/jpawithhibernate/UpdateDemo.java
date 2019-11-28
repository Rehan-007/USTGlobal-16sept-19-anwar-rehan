package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;

public class UpdateDemo {


	public static void main(String[] args) {


		EntityManager  em = null;
		EntityTransaction et = null;

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		em = emf.createEntityManager();
		et = em.getTransaction();
		et.begin();
		Product p = em.find(Product.class, 101);
		p.setPname("Laptop");
		System.out.println("Record Updated Succesfully");
		et.commit();



		em.close();

	}

}
