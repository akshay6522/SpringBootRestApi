package com.productApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.productApi.entity.Product;
import com.productApi.service.ProductService;

@RestController
public class ProductController {
	System.out.println("Dev1 changes");
	
	 
	@Autowired
	private ProductService service;
	@PostMapping(value ="/savetheProduct")
	public ResponseEntity<Boolean> saveProduct(@RequestBody Product product){
		
		boolean isAdded = service.saveProduct(product);
		
		if(isAdded) {
			return new ResponseEntity<Boolean>(isAdded, HttpStatus.CREATED);
		}
		else {
		
		return new ResponseEntity<Boolean>(isAdded, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@GetMapping(value = "/getAllProduct")
	
	public ResponseEntity<List<Product>> getAllProduct(){
		List<Product> allProduct = service.getAllProduct();
		
		return new ResponseEntity<List<Product>>(allProduct, HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	

}
 