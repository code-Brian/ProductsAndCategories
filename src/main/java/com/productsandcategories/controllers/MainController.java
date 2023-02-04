package com.productsandcategories.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.productsandcategories.services.CategoryService;
import com.productsandcategories.services.ProductService;

@Controller
public class MainController {
	@Autowired
	ProductService productServ;
	
	@Autowired
	CategoryService categoryServ;
	
	@GetMapping("/")
	public String dashboard(Model model) {
		model.addAttribute("allProducts", productServ.getAll());
		model.addAttribute("allCategories", categoryServ.getAll());
		return "index.jsp";
	}

}
