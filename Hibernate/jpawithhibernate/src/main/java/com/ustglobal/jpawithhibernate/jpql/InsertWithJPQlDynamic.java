package com.ustglobal.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class InsertWithJPQlDynamic {

	public static void main(String[] args) {
		
		EntityManager em = null;
		EntityTransaction et= null;
		String jpql = "insert into Product (pid,pname,quantity) values(:id,:name,:quantity)";
		
		try {
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			et = em.getTransaction();
			et.begin();
			Query qr = em.createQuery(jpql);
			qr.setParameter("id", 100);
			qr.setParameter("name", "Laptop");
			qr.setParameter("quantity", 20);
			
			int count = qr.executeUpdate();
			System.out.println(count+"Rows Inserted");
			et.commit();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
