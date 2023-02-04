package com.productsandcategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.productsandcategories.models.Category;
import com.productsandcategories.models.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{
	public List<Product> findAll();
	List<Product> findAllByCategories(Category category);
	List<Product> findByCategoriesNotContains(Category category);
}
