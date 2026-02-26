package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.model.User;

@Controller
//@RequestMapping("/user/api")
public class UserController {
	
	@RequestMapping
	public String homePage() {
		return "welcome";
	}
	
	@RequestMapping("/user")
	public String userForm() {
		return "userform";
	}
	
	@GetMapping("/submitform")
	public String submitUserForm(@RequestParam("username") String user,
								 @RequestParam("password") String pas,
								 User obj, Model model
								) {
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
