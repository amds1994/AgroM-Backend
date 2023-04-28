package com.company.inventary.services;

import org.springframework.http.ResponseEntity;

import com.company.inventary.model.Product;
import com.company.inventary.response.ProductResponseRest;

public interface IProductService {
	
	public ResponseEntity<ProductResponseRest> save(Product product, Long categoryId);
	public ResponseEntity<ProductResponseRest> searchById(Long id);
	public ResponseEntity<ProductResponseRest> searchByName(String name);

}
