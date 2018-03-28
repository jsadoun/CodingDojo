package com.sadounj.prodsandcats.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sadounj.prodsandcats.models.Category;
import com.sadounj.prodsandcats.models.Product;
import com.sadounj.prodsandcats.services.CategoryService;
import com.sadounj.prodsandcats.services.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController{
	@Autowired
	private ProductService productService;
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("")
	public String products(Model model){
		model.addAttribute("products",productService.all());
		return "products";
	}

	@RequestMapping("/new")
	public String _new(Model model){
		model.addAttribute("product",new Product());
		return "new_product.jsp";
	}
	@PostMapping("/new")
	public String create(@Valid @ModelAttribute("product") Product product,BindingResult res,RedirectAttributes re,Model model){				
		if(res.hasErrors()){
 			re.addFlashAttribute("errs",res.getAllErrors());
		}else{
			productService.create(product);
		}
		
		return "redirect:/";
	}
	
	@RequestMapping("/{id}")
	public String show(@PathVariable("id") long id,Model model){
		model.addAttribute("product",productService.find(id));
		model.addAttribute("categories",categoryService.all());
		return "show_product.jsp";
	}
	
	@PostMapping("/{productId}")
	public String add(@PathVariable("productId") long productId,@RequestParam("category") long categoryId){
		Optional<Product> product   = productService.find(productId);
		Product prod = (Product) product.get();
		Optional<Category> category = categoryService.find(categoryId);
		Category cat = (Category) category.get();
		List<Category> categories = prod.getCategories();
		
		categories.add(cat);
		productService.update(prod);
		
		return "redirect:/";
	}

}
