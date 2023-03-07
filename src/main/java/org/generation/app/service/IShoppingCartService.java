package org.generation.app.service;

import java.util.List;

import org.generation.app.model.ShoppingCart;

public interface IShoppingCartService {

	public ShoppingCart getShoppingCartById(long id);
	
	public List<ShoppingCart> getAllShoppingCart();
	
	public ShoppingCart setShoppingCart(ShoppingCart product);
	
	public ShoppingCart updateShoppingCart(ShoppingCart product);
	
	public String deleteShoppingCart(long idProduct);
	
}
