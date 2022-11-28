package com.cascading;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class TestCascading {

	public static void main(String[] args) {

		System.out.println("Project Started...!!!");
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();

		Address ad1 = new Address(1234, "Kop");
		Address ad2 = new Address(3232, "Pune");
		List<Address> list = new ArrayList();
		list.add(ad1);
		list.add(ad2);
		Person p1 = new Person(1, "Rushi", list);
		Transaction t = session.beginTransaction();

		session.save(p1);
		t.commit();
		
		Transaction t1 = session.beginTransaction();
		session.delete(p1);
		
		t1.commit();
		session.close();

		System.out.println("Project Ended...!!!");

	}

}
