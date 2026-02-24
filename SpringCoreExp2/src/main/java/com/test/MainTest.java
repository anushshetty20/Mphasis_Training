package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
//		Customer c1 = ctx.getBean("cst1", Customer.class);
//		System.out.println(c1);
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AnnoConfig.class);
		Address a1 = ctx.getBean(Address.class); 
		a1.setCity("Karkala");
		a1.setState("KA");
		a1.setCountry("INDIA");
		
		Customer c1 = ctx.getBean(Customer.class);
		c1.setId(130);
		c1.setName("Rakesh");
		c1.setAdr(a1);
		
		System.out.println(c1);
		
	}

}
