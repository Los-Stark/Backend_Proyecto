package org.generation.app.repository;

import org.generation.app.model.ShoppingCart;
import org.springframework.data.repository.CrudRepository;

public interface IShoppingCartRepository extends CrudRepository<ShoppingCart, Long> {
	
	ShoppingCart findById(long idProducts);
	
}
