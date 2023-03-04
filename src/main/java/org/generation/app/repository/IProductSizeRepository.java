package org.generation.app.repository;

import java.util.List;

import org.generation.app.model.ProductSize;
import org.springframework.data.repository.CrudRepository;

public interface IProductSizeRepository extends CrudRepository<ProductSize, Long> {

	ProductSize findById(long idTalla);
	
	//List<ProductSize> findAllByFkIdProductsIdProduct(long idProducts);
	
	
}
