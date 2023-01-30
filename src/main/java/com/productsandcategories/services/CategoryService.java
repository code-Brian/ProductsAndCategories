package com.productsandcategories.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productsandcategories.models.Category;
import com.productsandcategories.repositories.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	CategoryRepository categoryRepo;
	
	public Category getOne(Long id) {
		Optional<Category> optCategory = categoryRepo.findById(id);
		if(optCategory.isPresent()) {
			return optCategory.get();
		} else {
			return null;
		}
	}

}
