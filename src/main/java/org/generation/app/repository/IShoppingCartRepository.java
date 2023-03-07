package org.generation.app.repository;

import java.util.List;

import org.generation.app.model.ShoppingCart;
import org.generation.app.model.Users;
import org.springframework.data.repository.CrudRepository;

public interface IShoppingCartRepository extends CrudRepository<ShoppingCart, Long> {
	
	ShoppingCart findById(long idProducts);
	
	List<ShoppingCart> findAllByFkIdUserIdUser(long idUser);
	
}
