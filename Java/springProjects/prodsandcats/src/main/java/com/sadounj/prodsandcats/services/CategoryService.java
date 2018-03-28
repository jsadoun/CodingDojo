package com.sadounj.prodsandcats.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sadounj.prodsandcats.models.Category;
import com.sadounj.prodsandcats.repositories.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository cR;
	@Autowired
	private ProductService pS;
	
	public CategoryService(CategoryRepository cR){
		this.cR = cR;
	}
	
	public void create(Category category){
		cR.save(category);
	}
	
	public void update(Category category){
		cR.save(category);
	}
	
	public void destroy(long id){
		cR.deleteById(id);
	}
	
	public Optional<Category> find(long id) {
		return cR.findById(id);
	}
	
	public ArrayList<Category> all() {
		return (ArrayList<Category>) cR.findAll();
	}
}
