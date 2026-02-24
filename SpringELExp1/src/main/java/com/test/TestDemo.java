package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestDemo {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Student std = ctx.getBean("std", Student.class);
		System.out.println(std);
		
		ExpressionParser exp = new SpelExpressionParser();
		
		Expression ex = exp.parseExpression("'Simple MLA coders Spring EL example'");
		String dt = ex.getValue(String.class);
		System.out.println(dt + " literals");
		
		Expression ex1 = exp.parseExpression("'Simple MLA coders Spring EL example with uppercase'".toUpperCase());
		String dt1 = ex1.getValue(String.class);
		System.out.println(dt1);
		
		Expression ex2 = exp.parseExpression("100 * 5");
		System.out.println(ex2.getValue(Integer.class));
		
	}
}
