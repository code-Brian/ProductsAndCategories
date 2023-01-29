package com.productsandcategories.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.productsandcategories.models.Product;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@GetMapping("/create")
	public String createNewProduct(Model model) {
		model.addAttribute("product", new Product());
		return "createProduct.jsp";
	}
	
	// Eventually the ID will be included in the route and interpolated via @PathVariable
	@GetMapping("/view")
	public String viewProduct() {
		return "viewProduct.jsp";
	}
	
	@PostMapping("/create")
	public String createProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "createProduct.jsp";
		} else {
			return "redirect:/";
		}
	}
}