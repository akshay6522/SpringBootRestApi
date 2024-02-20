package com.productApi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.productApi.entity.Product;


public interface ProductService {
	
	public boolean saveProduct(Product product);
	public List<Product> getAllProduct();
	public boolean updateProduct(String productId);
}
