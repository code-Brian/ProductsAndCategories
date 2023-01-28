package com.productsandcategories.repositories;

import org.springframework.data.repository.CrudRepository;

import com.productsandcategories.models.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
