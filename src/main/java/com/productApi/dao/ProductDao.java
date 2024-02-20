package com.productApi.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.productApi.entity.Product;


public interface ProductDao {
	
	
	public boolean saveProduct(Product product);
	public List<Product> getAllproduct();
	public boolean updateProduct(String productId);
	

}
 