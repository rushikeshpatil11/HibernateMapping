package com.hqlquery;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class TestHQLQuery {

	public static void main(String[] args) {

		System.out.println("Project Started...!!!");
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Bank b1=new Bank(10, "Rushi", "SBI", "Kop");
		Bank b2=new Bank(11, "Rohit", "BOI", "Pune");
		
		
		Session session = factory.openSession();
		Transaction t1 = session.beginTransaction();
//		session.save(b1);
//		session.save(b2);
	
		//1.
		Query q1 = session.createQuery("from Bank");
		List<Bank> l = q1.getResultList();
		System.out.println(l);
		
		//2.
//		Query q2 = session.createQuery("update from Bank as b set b.name=:c where  b.branch=:b");
//		q2.setParameter("c", "Rushi");
//		q2.setParameter("b", "BOI");
//		int i = q2.executeUpdate();
//		System.out.println(i);
		
		
		//3.
		Query q3 = session.createQuery("delete from Bank as b where b.city=:x");
		q3.setParameter("x", "Kop");
		int i1 = q3.executeUpdate();
		System.out.println(i1);
		
		//4.
		Query q4 = session.createQuery("from Bank as b where b.branch=:x");
		q4.setParameter("x", "BOI");
		 Object o = q4.uniqueResult();
		System.out.println(o);
		t1.commit();
		session.close();
		System.out.println("Project Ended...!!!");
	}

}
