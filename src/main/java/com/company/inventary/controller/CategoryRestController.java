package com.company.inventary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.inventary.response.CategoryResponseRest;
import com.company.inventary.services.ICategoryService;

@RestController
@RequestMapping("/api/v1")
public class CategoryRestController {
	
	@Autowired
	private ICategoryService service;
	/**
	 * Get all categories 
	 * @return
	 */
	@GetMapping("/categories")
	public ResponseEntity<CategoryResponseRest> searchCategory() {
		
		ResponseEntity<CategoryResponseRest> response = service.search();
		return response;
	}
	
	/**
	 * Get categories by id
	 * @param id
	 * @return
	 */
	@GetMapping("/categories/{id}")
	public ResponseEntity<CategoryResponseRest> searchCategoryById(@PathVariable Long id) {
		
		ResponseEntity<CategoryResponseRest> response = service.searchById(id);
		return response;
	}

}
