package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.onetoone.Person;
import com.ustglobal.jpawithhibernate.onetoone.VoterCard;

public class TestOneToOne {

	public static void main(String[] args) {
		
		String com = "";
		EntityManager em = null;
		EntityTransaction et = null;
		VoterCard vc = new VoterCard();
		vc.setVid(69);
		vc.setVname("Mia");
		Person p = new Person();
		p.setPid(66);
		p.setPname("Mia");
		p.setVotercard(vc);
		try {
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			et = em.getTransaction();
			et.begin();
			VoterCard vCard = em.find(VoterCard.class, 69);
			System.out.println(vCard.getPerson().getPid());
//			em.persist(p);
			System.out.println("Record Saved");
			et.commit();
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
			et.rollback();
		}
		
		em.close();
	}
	
}
