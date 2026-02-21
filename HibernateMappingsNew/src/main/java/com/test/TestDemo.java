package com.test;

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
		
		Address address = new Address();
		address.setCity("Bantwal");
		address.setState("Karnataka");
		
		Employee emp = new Employee();
		emp.setE_name("Niteesh");
		emp.setE_cmp("MLA");
		emp.setAddress(address);
		address.setEmployee(emp);
		
		session.persist(emp);
		session.persist(address);
		
		t.commit();
		session.close();
	}
}
