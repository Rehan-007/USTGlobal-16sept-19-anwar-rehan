package com.ustglobal.jpawithhibernate;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.ManyToMany.Courses;
import com.ustglobal.jpawithhibernate.ManyToMany.Student;

public class TestManyTOMany {

	public static void main(String[] args) {
	
		EntityManager em = null;
		EntityTransaction et = null;
		
		Courses c = new Courses();
		c.setCid(1);
		c.setCname("Hibernate");
		Courses c1 = new Courses();
		c1.setCid(2);
		c1.setCname("SQL");
		ArrayList<Courses> al = new ArrayList<Courses>();
		al.add(c);
		al.add(c1);
		
		
		Student s = new Student();
		s.setSid(1);
		s.setSname("Gajendra");
		s.setCourses(al);
		
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			et = em.getTransaction();
			et.begin();
			em.persist(s);
			System.out.println("Rocord Saved");
			et.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			et.rollback();
		}
		em.close();
		
	}
	
}
