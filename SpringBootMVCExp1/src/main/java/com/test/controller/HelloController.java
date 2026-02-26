package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.model.User;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HelloController {
	
	@RequestMapping
	public String homePage() {
		return "welcome";
	}
	
	@RequestMapping("/user")
	public String userForm() {
		return "userform";
	}
	
	@RequestMapping("/submit")
	public String submitUserData(HttpServletRequest request, User obj, Model model) {
		String user = request.getParameter("username");
		String pas = request.getParameter("password");
		
		obj.setUsername(user);
		obj.setPassword(pas);
		
		model.addAttribute("info", obj);
		if(user.equals("admin") && pas.equals("java")) {
			return "success";
		}else {
			return "userform";
		}
	}
}
