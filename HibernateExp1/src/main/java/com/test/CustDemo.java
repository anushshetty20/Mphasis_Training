package com.test;

public class CustDemo {
	public static void main(String[] args) {
		CustDao cdao = new CustDao();
		Customer cst = new Customer();
		
		cst.setC_name("Sandesh");
		cst.setC_city("Udupi");
		
		//cdao.saveCustomer(cst);
		
		cdao.getAllCustomers().forEach(System.out::println);
		Customer cst1 = new Customer();
		cst1.setC_id(2);
		cst1.setC_name("Niteesh Nayak");
		cst1.setC_city("Hermunde");
		//cdao.updateCustomer(cst1);
		cdao.getAllCustomers().forEach(System.out::println);
		
		cdao.deleteCustomer(3);
		cdao.getAllCustomers().forEach(System.out::println);
	}
}
