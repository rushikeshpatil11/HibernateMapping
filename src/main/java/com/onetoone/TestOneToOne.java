package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestOneToOne {

	public static void main(String[] args) {

		System.out.println("Project Started...!!!");
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();

		PFAccount pf1 = new PFAccount(1234, "Father");
		Person p1 = new Person(11, 26, "Rushi", "Male", pf1);
		Transaction t1 = session.beginTransaction();
		session.save(pf1);
		session.save(p1);
		t1.commit();

		System.out.println(p1);
		session.close();
		System.out.println("Project Ended...!!!");
	}

}
