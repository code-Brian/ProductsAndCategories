package com.productsandcategories.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.productsandcategories.models.Category;

@Controller
@RequestMapping("/category")
public class CategoryController {
	
	@GetMapping("/create")
	public String createNewCategory(Model model) {
		model.addAttribute("category", new Category());
		return "createCategory.jsp";
	}
	
	// Eventually the ID will be included in the route and interpolated via @PathVariable
	@GetMapping("/view")
	public String viewCategory() {
		return "viewCategory.jsp";
	}
	
	@PostMapping("/create")
	public String createCategory(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		if(result.hasErrors()) {
			return "createCategory.jsp";
		} else {
			return "redirect:/";
		}
		
	}

}
