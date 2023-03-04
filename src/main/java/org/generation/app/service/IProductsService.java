package org.generation.app.service;

import java.util.List;

import org.generation.app.model.Products;

public interface IProductsService {

	public Products getProductById(long id);
	
	public List<Products> getAllProducts();
	
	public Products setProduct(Products product);
	
	public Products updateProduct(Products product);
	
	//public Products deleteProduct(ToDo)
	
	public Products assignProductsSize(long idProduct, long idProductSize);
	
	
	
}
