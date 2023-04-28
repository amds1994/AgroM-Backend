package com.company.inventary.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.company.inventary.model.Product;

public interface IProductDao extends CrudRepository<Product, Long>{
	
	//Metodo para buscar por nombre o palabra ingresada por el usuario
	
	//Consulta sql para buscar el nombre
	@Query("select p from Product p where p.name like %?1%")
	List<Product> findByNameLike(String name);
	
	/*
	 * Otra forma puede usarse utilizarla en caso de ser consultas simples
	 * 
	 */
	List<Product> findByNameContainingIgnoreCase(String name);
}
