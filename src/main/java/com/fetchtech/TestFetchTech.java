package com.fetchtech;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestFetchTech {

	public static void main(String[] args) {

		System.out.println("Project Started..!!!");
		
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session session=factory.openSession();
		
		Address ad1=new Address(1234, "kop");
		Address ad2=new Address(4321, "pune");
		
		List<Address> list=new ArrayList();
		list.add(ad1);
		list.add(ad2);
		
		Student s1=new Student(10, "Rushi", list);
		
		Transaction t=session.beginTransaction();
		
//		session.save(ad1);
//		session.save(ad2);
//		session.save(s1);
		
		t.commit();
		
		Student s=(Student)session.get(Student.class, 10);
		
		
		session.close();
		System.out.println("Project Ended..!!!");
	}

}
