package com.caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestSecondLevelCache {

	public static void main(String[] args) {

		System.out.println("Project Started...!!!");
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		Person p = new Person(1, "Rushi", 26);
		session.save(p);
		t.commit();

		session.close();


		session = factory.openSession();
		System.out.println(session.get(Person.class, 1));
		session.close();

		session = factory.openSession();
		System.out.println(session.get(Person.class, 1));
		session.close();
		System.out.println("Project Started...!!!");

	}

}
