package com.productApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productApi.dao.ProductDao;
import com.productApi.entity.Product;


@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao dao;
	
	
	@Override
	public boolean saveProduct(Product product) {

		boolean isAdded = dao.saveProduct(product);
		return isAdded;
	}


	@Override
	public List<Product> getAllProduct() {
		
		List<Product> allproduct = dao.getAllproduct();
		return allproduct;
	}


	@Override
	public boolean updateProduct(String productId) {
		// TODO Auto-generated method stub
		return false;
	}

}
