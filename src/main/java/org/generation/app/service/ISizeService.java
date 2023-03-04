package org.generation.app.service;

import java.util.List;

import org.generation.app.model.ProductSize;

public interface ISizeService {

	public ProductSize getSizeById(long idTalla);
	
	public ProductSize setProductSize(ProductSize productSize);
	
	public ProductSize updateProductSize(ProductSize productSize);
	
	public List<ProductSize> getAllSizesByFkIdProduct(long idProduct);
	
	
}
