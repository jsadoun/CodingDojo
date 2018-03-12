package com.sadounj.counter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")

public class CounterController {

	@RequestMapping("")
	public String index(){
		
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(){
		
		return "counter.jsp";
	}
	
}
