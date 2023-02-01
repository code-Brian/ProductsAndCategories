package com.productsandcategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.productsandcategories.models.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{
	public List<Product> findAll();
}
