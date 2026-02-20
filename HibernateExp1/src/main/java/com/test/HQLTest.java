package com.test;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLTest {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		String hql = "from Customer";
		List<Customer> list = session.createQuery(hql).list();
		list.forEach(System.out::println);
		
		String hql1 = "delete from Customer where c_id = :id";
		Query q = session.createQuery(hql1);
		q.setParameter("id", 1);
		int row = q.executeUpdate();
		t.commit();
		
		List<Customer> list1 = session.createQuery("from Customer").list();
		list1.forEach(System.out::println);
	}
}
