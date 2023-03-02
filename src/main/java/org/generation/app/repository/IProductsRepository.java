package org.generation.app.repository;

import org.generation.app.model.Products;
import org.springframework.data.repository.CrudRepository;

public interface IProductsRepository extends CrudRepository<Products, Long> {
	
	Products findById(long idProduct);
	
}
