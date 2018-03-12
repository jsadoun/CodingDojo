package com.sadounj.displaydate.controllers;

import java.util.Date;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")

public class DisplayDateController {
	
	@RequestMapping("")
	public String index(){
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model){
		Date date = new Date();		
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, 'the' dd 'of' MMMM, yyyy");
			model.addAttribute("date", dateFormat.format(date));
			return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model){
		Date time = new Date();
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");
			model.addAttribute("time", timeFormat.format(time));
			return "time.jsp";
	}
}
