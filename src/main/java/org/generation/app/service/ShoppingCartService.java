package org.generation.app.service;

import java.util.List;

import org.generation.app.model.ShoppingCart;
import org.generation.app.model.Users;
import org.generation.app.repository.IShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartService implements IShoppingCartService {

	@Autowired
	IShoppingCartRepository shoppingCartRepository;

	@Override
	public ShoppingCart getShoppingCartById(long idProduct) {
		return shoppingCartRepository.findById(idProduct);
	}

	@Override
	public List<ShoppingCart> getAllShoppingCart() {
		List<ShoppingCart> allProductsShoppingCart = (List<ShoppingCart>)shoppingCartRepository.findAll();
		return allProductsShoppingCart;
	}

	@Override
	public ShoppingCart setShoppingCart(ShoppingCart product) {
		ShoppingCart newProductShoppingCart = product;
        newProductShoppingCart.setIdProducts(0);
        return shoppingCartRepository.save(newProductShoppingCart);
	}

	@Override
	public ShoppingCart updateShoppingCart(ShoppingCart newDataShoppingCart) {
		// Obtener los datos actuales del producto
        ShoppingCart productsShoppingCart = getShoppingCartById(newDataShoppingCart.getIdProducts());
        //Actualizar los datos permitidos
        productsShoppingCart.setImageURL( newDataShoppingCart.getImageURL() );
        productsShoppingCart.setName( newDataShoppingCart.getName() );
        productsShoppingCart.setPrice(newDataShoppingCart.getPrice());
        productsShoppingCart.setTalla(newDataShoppingCart.getTalla());

        return shoppingCartRepository.save(productsShoppingCart);
	}

	@Override
	public String deleteShoppingCart(long idProduct) {
		ShoppingCart shoppingCart = getShoppingCartById(idProduct);		
		shoppingCartRepository.delete(shoppingCart);
		return "El producto con:  " + idProduct + " fue eliminado";	
	}

	@Override
	public List<ShoppingCart> getAllShoppingCartByFkIdUsers(long idUser) {
		return shoppingCartRepository.findAllByFkIdUserIdUser(idUser);

	}


	
}
