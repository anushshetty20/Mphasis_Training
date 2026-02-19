package com.test;

import java.util.List;

public class TestDemo {

	public static void main(String[] args) {
		EmpDao edao = new EmpDao();
		Employee emp1 = new Employee();
		emp1.setId(2);
		emp1.setName("E");
		emp1.setCmp("Cisco");
		emp1.setCity("Mumbai");
		
		edao.saveEmployee(emp1);
		System.out.println("Saved Employee Data.");
		List<Employee> list = edao.getAllEmployees();
		list.forEach(System.out::println);
		
//		Employee emp2 = new Employee();
//		emp2.setId(1);
//		emp2.setName("E");
//		emp2.setCmp("Meta");
//		emp2.setCity("Chennai");
//		
//		edao.updateEmployee(emp2);
//		System.out.println("Updated Employee Data.");
//		List<Employee> list1 = edao.getAllEmployees();
//		list1.forEach(System.out::println);
		
//		edao.deleteEmployee(1);
//		System.out.println("Deleted Employee Data.");
//		List<Employee> list2 = edao.getAllEmployees();
//		list2.forEach(System.out::println);
	}

}
