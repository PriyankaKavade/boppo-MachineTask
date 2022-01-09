package com.example.demo.service;

import java.util.List;

import com.example.demo.binding.Product;

public interface ProductService {
	public String createProduct(Product prod);

	public List<Product> getProduct();

	public Product updateProduct(Integer pcode);

	public List<Product> deleteProduct(Integer pcode);
}
