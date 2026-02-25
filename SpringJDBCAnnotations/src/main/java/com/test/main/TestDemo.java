package com.test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.config.DBConfig;
import com.test.dao.FruitsDao;
import com.test.model.Fruits;

public class TestDemo {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(DBConfig.class);
		FruitsDao dao = ctx.getBean(FruitsDao.class);
		Fruits f = new Fruits();
		f.setId(101);
		f.setName("banana");
		f.setPrice(30);
		f.setQuantity(12);

		 dao.saveFruits(f);

		dao.getAllFruits().forEach(System.out::println);

		// dao.updateFruits(f);
		// System.out.println();
		// dao.getAllFruits().forEach(System.out::println);

//		 dao.deleteFruits(f);
//		 System.out.println();
//		 dao.getAllFruits().forEach(System.out::println);
	}
}
