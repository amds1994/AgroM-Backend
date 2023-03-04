package com.company.inventary.response;

import java.util.List;

import com.company.inventary.model.Category;

import lombok.Data;


@Data
public class CategoryResponse {

	
	private List<Category> category;
}
