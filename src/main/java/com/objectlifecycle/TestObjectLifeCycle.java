package com.objectlifecycle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestObjectLifeCycle {

	public static void main(String[] args) {

		System.out.println("Project Started...!!!");
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		// 1. Transient Stage=>Object Create but not Associated with Session and Database
		Person p = new Person(1, "Rushi", "Male");
		

		// 2. Persistent Stage=>Object Associated with Session and Save in Database
		session.save(p);
		

		// 3. Detached Stage=>Object Not Associated with Session but Saved in Database
		t.commit();
		session.close();
		

		// 4. Removed Stage=>Object Removed From Database but Associated with Session
		session = factory.openSession();
		t = session.beginTransaction();
		session.delete(p);
		t.commit();
		session.close();
		System.out.println("Project Ended...!!!");
	}
}
