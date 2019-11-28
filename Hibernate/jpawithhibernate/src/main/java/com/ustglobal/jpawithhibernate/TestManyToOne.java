package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.manytoone.Pencil;
import com.ustglobal.jpawithhibernate.manytoone.PencilBox;

public class TestManyToOne {

	public static void main(String[] args) {
		
		PencilBox pb = new PencilBox();
		pb.setBid(12);
		pb.setBname("Apsara");
		
		Pencil p = new Pencil();
		p.setPid(10);
		p.setColor("Black");
		p.setPencilBox(pb);
		
		Pencil p1 = new Pencil();
		p1.setPid(20);
		p1.setColor("Red");
		p1.setPencilBox(pb);
		
		EntityManager em = null;
		EntityTransaction et = null;
		try {
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			et = em.getTransaction();
			et.begin();
			em.persist(p);
			em.persist(p1);
			System.out.println("Record Saved");
			et.commit();
			
		}catch(Exception e) {
			e.printStackTrace();
			et.rollback();
		}
		em.close();
	}
	
}
