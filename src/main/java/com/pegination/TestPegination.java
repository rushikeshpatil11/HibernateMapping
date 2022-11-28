package com.pegination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class TestPegination {

	public static void main(String[] args) {

		System.out.println("Project Started...!!!");
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		Car c1=new Car(1, "BMW", "White");
		Car c2=new Car(2, "Swift", "Red");
		Car c3=new Car(3, "Baleno", "Blue");
		Car c4=new Car(4, "Creata", "Black");
		Transaction t = session.beginTransaction();
		session.save(c1);
		session.save(c2);
		session.save(c3);
		session.save(c4);
		
		t.commit();
		
		Query query = session.createQuery("from Car");
		query.setFirstResult(3);
		query.setMaxResults(3);
		List list = query.list();
		
		System.out.println(list);
		
		session.close();
		
		System.out.println("Project Ended...!!!");
	}

}
