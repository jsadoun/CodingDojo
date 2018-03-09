package com.example.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController{	
	@RequestMapping("")
	public String index(){
		return "index.html";
	}

	@RequestMapping("/me")
	public String about(){
		return "aboutme.html";
	}

	@RequestMapping("/projects")
	public String projects(){
		return "myprojects.html";
	}
}
