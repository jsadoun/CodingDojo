package com.swilliams.queryparams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

@RequestMapping("/")
public class QueryController {
 
    @RequestMapping("")
    public String name(@RequestParam(value="first", required=false) String first, @RequestParam(value="last", required=false) String last, Model model) {
    	model.addAttribute("first",first); 
    	model.addAttribute("last",last);        
        return "index.jsp";
    }
}