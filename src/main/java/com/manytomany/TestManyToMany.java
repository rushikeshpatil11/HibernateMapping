package com.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestManyToMany {

	public static void main(String[] args) {

		
		System.out.println("Project Started...!!!");
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session session=factory.openSession();
		Project p1=new Project();
		p1.setP_id(1001);
		p1.setP_name("Banking");
		Project p2=new Project();
		p2.setP_id(2001);
		p2.setP_name("Telecom");
		
		List<Project> list1=new ArrayList<Project>();
		list1.add(p1);
		list1.add(p2);
		
		EmployeeTCS e1=new EmployeeTCS();
		e1.setE_id(1);
		e1.setE_name("Rushi");
		EmployeeTCS e2=new EmployeeTCS();
		e1.setE_id(2);
		e1.setE_name("Rohit");
		
		List<EmployeeTCS> list2=new ArrayList<EmployeeTCS>();
		list2.add(e1);
		list2.add(e2);
		
		p1.setEmployees(list2);
		e2.setProjects(list1);
		p2.setEmployees(list2);
		e1.setProjects(list1);
		Transaction t=session.beginTransaction();
		
		session.save(p1);
		session.save(p2);
		session.save(e1);
		session.save(e2);
		
		e1.setE_name("Rushi");
		t.commit();
		session.close();
		System.out.println("Project Ended...!!!");
	}

}
