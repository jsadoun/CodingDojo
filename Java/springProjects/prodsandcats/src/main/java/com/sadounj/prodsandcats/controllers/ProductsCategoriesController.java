package com.sadounj.prodsandcats.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sadounj.prodsandcats.services.CategoryService;
import com.sadounj.prodsandcats.services.ProductService;

@Controller
@RequestMapping("/")
public class ProductsCategoriesController {
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private ProductService productService;
	
	@RequestMapping("")
	public String index(Model model){
		model.addAttribute("categories",categoryService.all());
		model.addAttribute("products", productService.all());
		return "index";
	}
}