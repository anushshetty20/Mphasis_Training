package com.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookDemo {

	public static void main(String[] args) {
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
//		
//		Book b = (Book)ctx.getBean("bk");
//		System.out.println(b);
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AnnoConfig.class);
		BookDetails b1 = ctx.getBean(BookDetails.class);
		Book b2 = ctx.getBean(Book.class);
		
		b1.setPages(2200);
		b1.setPublisher("MLA");
		b1.setPyear(2026);
		
		b2.setId(101);
		b2.setName("Father of Advancece Java");
		b2.setAuthor("Niteesh");
		b2.setPrice(450);
		b2.setListbd(Arrays.asList(b1));
		
		System.out.println(b2);
	}

}
