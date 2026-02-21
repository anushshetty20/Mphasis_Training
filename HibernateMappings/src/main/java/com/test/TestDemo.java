package com.test;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		Order o1 = new Order();
		o1.setO_name("Laptop");
		o1.setO_price(230);
		
		Order o2 = new Order();
		o2.setO_name("mouse");
		o2.setO_price(13);
		
		List<Order> listOrder = Arrays.asList(o1,o2);
		
		User u1 = new User();
		u1.setU_name("Niteesh");
		u1.setOrders(listOrder);
		
		session.persist(u1);
		t.commit();
		session.close();
	}
}
