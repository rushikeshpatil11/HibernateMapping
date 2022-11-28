package com.pegination;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDemo {

	public static void main(String[] args) {

		System.out.println("Project Started...!!!");
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();
		Iphone i1 = new Iphone("Rp", "12MINI", "White", 40000);
		Iphone i2 = new Iphone("Np", "13PRO", "Black", 65000);
		Iphone i3 = new Iphone("Ap", "14", "Blue", 80000);
		Iphone i4 = new Iphone("Sp", "14PRO", "Green", 99000);
		Transaction tx = session.beginTransaction();

		String id1 = (String) session.save(i1);
		String id2 = (String) session.save(i2);
		String id3 = (String) session.save(i3);
		String id4 = (String) session.save(i4);
		tx.commit();
		List<Iphone> list = new ArrayList();
		list.add((Iphone)session.get(Iphone.class, id1));
		list.add((Iphone)session.get(Iphone.class, id2));
		list.add((Iphone)session.get(Iphone.class, id3));
		list.add((Iphone)session.get(Iphone.class, id4));

		for (Iphone i : list)
			System.out.println("AppleId : " + i.getAppleid() + ", Model : " + i.getModel() + ", Color :" + i.getColor()
					+ ", Price : " + i.getPrice());

		System.out.println("Project Ended...!!!");
	}

}