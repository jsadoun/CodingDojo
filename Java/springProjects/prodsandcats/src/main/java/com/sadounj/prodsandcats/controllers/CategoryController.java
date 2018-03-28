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
@RequestMapping("/categories")
public class CategoryController {
	@Autowired
	private CategoryService cS;
	@Autowired
	private ProductService pS;
	
	@RequestMapping("")
	public String categories(Model model) {
		model.addAttribute("categories",cS.all());
		return "categories";
	}
	
	@RequestMapping("/new")
	public String newCat(Model model) {
		model.addAttribute("category", new Category());
		return "newCat.jsp";
	}
	
	@PostMapping("/new")
	public String newCat(@Valid @ModelAttribute("category") Category category, BindingResult res, RedirectAttributes re) {
		if(res.hasErrors()) {
			re.addFlashAttribute("errs", res.getAllErrors());
		}else {
			cS.create(category);
		}
		return "redirect:/";
	}
	
	@RequestMapping("/{id}")
	public String show(@PathVariable("id") long id, Model model) {
		model.addAttribute("category", cS.find(id));
		model.addAttribute("products", pS.all());
		return "show_category.jsp";
	}
	
	@PostMapping("/{categoryId}")
	public String add(@PathVariable("categoryId") long categoryId, @RequestParam("product") long productId) {
		Optional<Category> category = cS.find(categoryId);
		Category cat = (Category) category.get();
		Optional<Product> product = pS.find(productId);
		Product prod = (Product) product.get();
		List<Product> products = cat.getProducts();
		
		products.add(prod);
		cS.update(cat);
		
		return "redirect:/";
		
	}
	
	
}
