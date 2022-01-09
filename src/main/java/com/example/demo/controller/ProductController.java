package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.binding.Product;
import com.example.demo.service.ProductService;

@RestController
	public class ProductController {

	    @Autowired
	    public ProductService service;

	    
	    @PostMapping("/create")
		public String createProducts(@RequestBody Product prod)
		{
			String status = service.createProduct(prod);
			System.out.println(prod);
			return status;	
			
		}
		
	    @GetMapping("/getProducts")
	    public List<Product> getProducts(){


			return service.getProduct();
	    }

	    
	   @GetMapping("/update/{pcode}")
		public Product updateProducts(@PathVariable Integer pcode)
		{
			return service.updateProduct(pcode);
		}
	    
	    
	    @DeleteMapping("/delete/{pcode}")
	    public List<Product> deleteProducts(@PathVariable Integer pcode) {

	    	return service.deleteProduct(pcode);

	    }
	}


