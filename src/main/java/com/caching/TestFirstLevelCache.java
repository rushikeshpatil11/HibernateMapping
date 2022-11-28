package com.caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestFirstLevelCache {

	public static void main(String[] args) {

		
		System.out.println("Project Started...!!!");
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		
		Session session = factory.openSession();
		
		Address ad1=new Address(12, "Kop");
		Transaction t = session.beginTransaction();
		
		session.save(ad1);
		t.commit();
		session.close();
		session=factory.openSession();
		Address a=session.get(Address.class, 12);
		System.out.println(a);
		
		System.out.println("Some Other Work");
		
		Address a1=session.get(Address.class, 12);
		System.out.println(a1);
		session.close();
		
		System.out.println("Project Ended...!!!");
		
	}

}
