package com.test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.dao.MLATeamDao;
import com.test.dao.MLAteamDao1;
import com.test.model.MLATeam;

public class TestDemo {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		//jdbc template example
		MLATeamDao dao = ctx.getBean("tdao", MLATeamDao.class);
		
//		MLATeam obj = new MLATeam();
//		obj.setId(103);
//		obj.setName("Ritesh");
//		obj.setSkill("C Trader");
//		obj.setManager("Harshad Mehta");
//		
//		//dao.saveMLATeam(obj);
//		
//		dao.getAllMember().forEach(System.out::println);
//		
//		MLATeam obj1 = new MLATeam();
//		obj1.setId(102);
//		obj1.setName("Niteesh Mustafa");
//		obj1.setSkill("Pakistan Batting Coach");
//		obj1.setManager("Babar");
//		//dao.updateMLATeam(obj1);
////		System.out.println();
////		dao.getAllMember().forEach(System.out::println);
//		
//		dao.deleteMLATeamMember(obj1);
//		System.out.println();
//		dao.getAllMember().forEach(System.out::println);
		
		//named parameter jdbc template
		MLAteamDao1 dao1 = ctx.getBean("tdao1", MLAteamDao1.class);
		MLATeam obj = new MLATeam();
		obj.setId(120);
		obj.setName("Rohit");
		obj.setSkill("Python Developer");
		obj.setManager("Jasmin");
		
		//dao1.createMLATeam(obj);
		
		//dao1.updateMLATeam(obj);
		
		dao1.deleteMLATeam(obj);
	}

}
