package com.productsandcategories.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productsandcategories.models.Product;
import com.productsandcategories.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepo;
	
	public Product getOne(Long id) {
		Optional<Product> optProduct = productRepo.findById(id);
		if(optProduct.isPresent()) {
			return optProduct.get();
		} else {
			return null;
		}
	}
	
	public List<Product> getAll(){
		return productRepo.findAll();
	}
	
	public Product create(Product p) {
		return productRepo.save(p);
	}
	
	public Product update(Product p) {
		return productRepo.save(p);
	}
	
	public void delete(Long id) {
		productRepo.deleteById(id);
	}
	
}
