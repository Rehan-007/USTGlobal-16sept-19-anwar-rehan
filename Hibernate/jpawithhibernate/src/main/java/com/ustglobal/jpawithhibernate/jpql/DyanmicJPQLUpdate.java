package com.ustglobal.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DyanmicJPQLUpdate {

	public static void main(String[] args) {
		
		String jpql = "update Product  set pname=:name where pid=:id";
		EntityManager em = null;
		EntityTransaction et = null;
		
		try {
			
			EntityManagerFactory emf= Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			et = em.getTransaction();
			et.begin();
			Query qr = em.createQuery(jpql);
			qr.setParameter("name", "Book");
			qr.setParameter("id", 101);
			int count = qr.executeUpdate();
			System.out.println(count+" Updated");
			et.commit();
			
		} catch(Exception e) {
			e.printStackTrace();
			et.rollback();
		}
		em.close();
	}
	
}
