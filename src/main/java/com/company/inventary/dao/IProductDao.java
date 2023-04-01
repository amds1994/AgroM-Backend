package com.company.inventary.dao;

import org.springframework.data.repository.CrudRepository;

import com.company.inventary.model.Product;

public interface IProductDao extends CrudRepository<Product, Long>{

}
