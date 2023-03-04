package com.company.inventary.dao;

import org.springframework.data.repository.CrudRepository;

import com.company.inventary.model.Category;

public interface ICategoryDao extends CrudRepository<Category, Long>{

}
