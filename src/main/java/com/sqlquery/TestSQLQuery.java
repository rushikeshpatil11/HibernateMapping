package com.sqlquery;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class TestSQLQuery {

	public static void main(String[] args) {

		System.out.println("Project Started...!!!");
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Customer c1 = new Customer(1, "Rushi", "Kop");
		Customer c2 = new Customer(2, "Nishu", "Islampur");
		Customer c3 = new Customer(3, "Shree", "Sangli");
		Customer c4 = new Customer(4, "Akshay", "Satara");
		Customer c5 = new Customer(5, "Rohit", "Pune");
		Transaction t = session.beginTransaction();
//		session.save(c1);
//		session.save(c2);
//		session.save(c3);
//		session.save(c4);
//		session.save(c5);

		t.commit();
		//1.Get=
		NativeQuery nq = session.createSQLQuery("select * from Customer");
		List<Object []> l = nq.list();
		for(Object[] c:l)
			System.out.println(c[2].toString());
		
		//2.Insert=
//		Transaction t2 = session.beginTransaction();
//		NativeQuery nq2 = session.createSQLQuery("insert into Customer values(10,'EEE','Pune')");
//		int i = nq2.executeUpdate();
//		System.out.println(i);
//		t2.commit();
		
		//3.Delete=
		Transaction t3 = session.beginTransaction();
		NativeQuery nq3 = session.createSQLQuery("delete from Customer as c where c.name='Pune'");
		int i2 = nq3.executeUpdate();
		System.out.println(i2);
		t.commit();
		
		
		
		session.close();
		System.out.println("Project Ended...!!!");

	}

}
