package com.sadounj.prodsandcats.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sadounj.prodsandcats.models.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {

}
