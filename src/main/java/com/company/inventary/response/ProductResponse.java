package com.company.inventary.response;

import java.util.List;

import com.company.inventary.model.Product;

import lombok.Data;


@Data
public class ProductResponse {
	
	List<Product> products;
	

}
