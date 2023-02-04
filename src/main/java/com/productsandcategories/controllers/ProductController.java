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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.productsandcategories.models.Category;
import com.productsandcategories.models.Product;
import com.productsandcategories.services.CategoryService;
import com.productsandcategories.services.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService productServ;
	
	@Autowired
	CategoryService categoryServ;
	
	@GetMapping("/create")
	public String createNewProduct(Model model) {
		model.addAttribute("product", new Product());
		return "createProduct.jsp";
	}
	
	@GetMapping("/{id}/view")
	public String viewProduct(@PathVariable("id") Long productId, Model model) {
		model.addAttribute("product", productServ.getOne(productId));
		model.addAttribute("assignedCategories", categoryServ.getAssignedCategories(productServ.getOne(productId)));
		model.addAttribute("unassignedCategories", categoryServ.getUnassignedCategories(productServ.getOne(productId)));
		return "viewProduct.jsp";
	}
	
	@PutMapping("/{id}/addCategory")
	public String addCategoryToProduct(@PathVariable("id") Long productId, Model model, @RequestParam(name="name") Long categoryId) {
		Product product = productServ.getOne(productId);
		Category category = categoryServ.getOne(categoryId);
		product.getCategories().add(category);
		productServ.update(product);
		return "redirect:/product/{id}/view";
	}
	
	@PostMapping("/create")
	public String createProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "createProduct.jsp";
		} else {
			productServ.create(product);
			return "redirect:/";
		}
	}
}