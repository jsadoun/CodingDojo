package com.sadounj.login_reg.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sadounj.login_reg.models.User;

@Controller
public class UserController {

	public UserController() {
		
	}
	@RequestMapping("/register")
		public String registerForm(@Valid @ModelAttribute("user") User user) {
		return "registrationPage";
	}
 
	@RequestMapping("/login")
		public String login() {
		return "loginPage";
	}
}