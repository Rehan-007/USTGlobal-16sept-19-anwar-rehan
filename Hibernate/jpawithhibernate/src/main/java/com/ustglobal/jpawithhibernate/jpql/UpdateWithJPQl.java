package com.ustglobal.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernate.dto.Product;

public class UpdateWithJPQl {

	public static void main(String[] args) {
		
		EntityManager em = null;
		EntityTransaction et = null;
		
		try {
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			et = em.getTransaction();
			et.begin();
			String jpql = "update Product set pname ='Pen' where pid='102'";
			Query qr = em.createQuery(jpql);
			
			int res = qr.executeUpdate();
			System.out.println(res+"Rows Effected");
			
			et.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			et.rollback();
		}
		
		em.close();
	}
	
}
