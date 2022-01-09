package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.binding.Product;
import com.example.demo.entity.ProductEntity;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepo;

	@Override
	public String createProduct(Product prod) {
		ProductEntity entity = new ProductEntity();
		// entity.setActiveSw("Y");
		BeanUtils.copyProperties(prod, entity);
		entity = productRepo.save(entity);
		if (entity.getPcode() != null) {
			return "success";
		}
		return "Unable to create a Product";

	}

	@Override
	public List<Product> getProduct() {
		List<Product> data = new ArrayList<>();
		List<ProductEntity> findAll = productRepo.findAll();
		for (ProductEntity entity : findAll) {
			Product prod = new Product();
			BeanUtils.copyProperties(entity, prod);
			data.add(prod);
		}
		return data;
	}

	@Override
	public Product updateProduct(Integer pcode) {
		Optional<ProductEntity> findById = productRepo.findById(pcode);
		if (findById.isPresent()) {
			ProductEntity entity = findById.get();
			Product prod = new Product();
			BeanUtils.copyProperties(entity, prod);
			return prod;
		}
		return null;

	}

	@Override
	public List<Product> deleteProduct(Integer pcode) {
		productRepo.deleteById(pcode);
		return getProduct();
	}

}
