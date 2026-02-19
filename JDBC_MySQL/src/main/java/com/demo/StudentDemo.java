package com.demo;

import java.util.List;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDao sdao = new StudentDao();
		Student s = new Student();
		s.setUsn("CS3");
		s.setName("C");
		s.setCollege("CCC");
		
		//sdao.saveStudent(s);
		//System.out.println("Saved Student details");
		List<Student> list = sdao.getAllStudent();
		list.forEach(System.out::println);
		
//		Student s1 = new Student();
//		s1.setUsn("CS2");
//		s1.setName("D");
//		s1.setCollege("DDD");
//		sdao.updateStudent(s1);
//		System.out.println("Updated Student details");
//		List<Student> list1 = sdao.getAllStudent();
//		list1.forEach(System.out::println);
		
		sdao.deleteStudent("CS3");
		System.out.println("Deleted Student details");
		List<Student> list2 = sdao.getAllStudent();
		list2.forEach(System.out::println);
		
	}

}
