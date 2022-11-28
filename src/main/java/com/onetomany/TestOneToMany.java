package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestOneToMany {

	public static void main(String[] args) {
		
		System.out.println("Project Started...!!!");
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session session=factory.openSession();
		
		Address ad1=new Address(1234, "Kolhapur");
		Address ad2=new Address(4321,"Pune");
		List<Address> list=new ArrayList();
		list.add(ad1);
		list.add(ad2);
		
		Employee e1=new Employee(101, "Rushi", list);
		Transaction t1=session.beginTransaction();
		session.save(ad1);
		session.save(ad2);
		session.save(e1);
		t1.commit();
		
		
		
		
		session.close();
		System.out.println("Project Ended...!!!");
	}

}
