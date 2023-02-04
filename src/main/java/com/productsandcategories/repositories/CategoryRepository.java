package com.productsandcategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.productsandcategories.models.Category;
import com.productsandcategories.models.Product;

public interface CategoryRepository extends CrudRepository<Category, Long> {
	public List<Category> findAll();
	List<Category> findAllByProducts(Product product);
	List<Category> findByProductsNotContains(Product product);
}
