package com.productsandcategories.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@GetMapping("/create")
	public String createNewProduct() {
		return "createProduct.jsp";
	}
	
	// Eventually the ID will be included in the route and interpolated via @PathVariable
	@GetMapping("/view")
	public String viewProduct() {
		return "viewProduct.jsp";
	}
}