package com.sadounj.prodsandcats.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sadounj.prodsandcats.models.Category;
import com.sadounj.prodsandcats.models.Product;
import com.sadounj.prodsandcats.repositories.ProductRepository;

@Service
public class ProductService {
	private ProductRepository pR;
	private CategoryService cS;
	
	public ProductService(ProductRepository pR){
		this.pR = pR;
	}
	

	public ArrayList<Product> all(){
		return (ArrayList<Product>) pR.findAll();
	}
	
	public void create(Product product){
		pR.save(product);
	}
	
	public void update(Product product){
		pR.save(product);
	}
	
	public void destroy(long id){
		pR.deleteById(id);
	}
	
	public Optional<Product> find(long id) {
		return pR.findById(id);
	}
	
	public ArrayList<Product> exclude(){
		ArrayList<Product> products = this.all();
		ArrayList<Category> categories = cS.all();
		
		for(int i=0;i<products.size();i++){
			for(int j=0;j<categories.size();j++){
				if(products.get(i) == categories.get(j).getProducts().get(j)){
					products.remove(i);
				}
			}
		}
		
		return products;
	}

	
}
