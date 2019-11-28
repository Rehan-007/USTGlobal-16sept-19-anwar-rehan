package com.ustglobal.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernate.dto.Product;

public class ReadNamesWithJPQL {

	public static void main(String[] args) {
		
		String jpql = "select pname from Product";
		
		EntityManager em = null;
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		em = emf.createEntityManager();
		Query qr = em.createQuery(jpql);
		List<String> l = qr.getResultList();
		for(String lp : l ){
			System.out.println(lp);
		}
		
	}
	
	
}
