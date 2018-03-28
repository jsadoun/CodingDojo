package com.sadounj.prodsandcats.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sadounj.prodsandcats.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
	
}
