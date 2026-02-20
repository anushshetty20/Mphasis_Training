package com.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CustDao {
	
	public static Session getDBSession() {
		Session session = null;
		try {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			SessionFactory sf = cfg.buildSessionFactory();
			session = sf.openSession();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return session;
	}
	public void saveCustomer(Customer cst) {
			Session session = CustDao.getDBSession();
			Transaction t = session.beginTransaction();
			session.persist(cst);
			t.commit();
			session.close();
			System.out.println("Records added successfully..");
	}
	
	public List<Customer> getAllCustomers(){
		Session session = CustDao.getDBSession();
		List<Customer> list = session.createQuery("from Customer").list();
		return list;
	}
	
	public void updateCustomer(Customer cst) {
		Session session = CustDao.getDBSession();
		Transaction t = session.beginTransaction();
		Customer obj = session.find(Customer.class, cst.getC_id());
		obj.setC_name(cst.getC_name());
		obj.setC_city(cst.getC_city());
		session.persist(obj);
		t.commit();
		System.out.println("Record Updated successfully");
	}
	
	public void deleteCustomer(int id) {
		Session session = CustDao.getDBSession();
		Transaction t = session.beginTransaction();
		Customer obj = session.get(Customer.class, id);
		session.remove(obj);
		t.commit();
		System.out.println("Record Deleted Successfully");
	}
}
