package com.ustglobal.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernate.dto.Product;

public class ReadJPQL {

	public static void main(String[] args) {
		
		String jpql = "from Product";
		
		EntityManager em = null;
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		em = emf.createEntityManager();
		Query qr = em.createQuery(jpql);
		List<Product> l = qr.getResultList();
		for(Product lp : l ){
			System.out.println(lp);
		}
		
	}
	
}
