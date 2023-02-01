package com.productsandcategories.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.productsandcategories.models.Category;
import com.productsandcategories.services.CategoryService;
import com.productsandcategories.services.ProductService;

@Controller
@RequestMapping("/category")
public class CategoryController {
	@Autowired
	CategoryService categoryServ;
	
	@Autowired
	ProductService productServ;
	
	// Creates a new instance of the Category and renders the jsp
	@GetMapping("/create")
	public String createNewCategory(Model model) {
		model.addAttribute("category", new Category());
		return "createCategory.jsp";
	}
	
	// This is what gets submitted via form
	@PostMapping("/create")
	public String createCategory(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		if(result.hasErrors()) {
			return "createCategory.jsp";
		} else {
			categoryServ.create(category);
			return "redirect:/";
		}
		
	}
	
	@GetMapping("/{id}/view")
	public String readCategory(@PathVariable("id") Long categoryId, Model model) {
		model.addAttribute("category", categoryServ.getOne(categoryId));
		model.addAttribute("allProducts", productServ.getAll());
		return "createCategory.jsp";
	}

}
