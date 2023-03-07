package org.generation.app.controller;

import java.util.List;




import org.generation.app.model.ShoppingCart;
import org.generation.app.service.IShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/shoppingcart")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ShoppingCartController {

	@Autowired
	IShoppingCartService shoppingCartService;
	
	
	@GetMapping("{id}")
	public ShoppingCart getShoppingCartById(@PathVariable("id") long idProduct) {
		return shoppingCartService.getShoppingCartById(idProduct);
		
	}
	
	@GetMapping
	public List<ShoppingCart> getAllProductsShoppingCart(){
		return shoppingCartService.getAllShoppingCart();
		
	}
	
	@PostMapping //localhost:8080/api/shoppingcart
    public ResponseEntity<?> setNewShoppingCartProducts(@RequestBody ShoppingCart products) {
 
            return new ResponseEntity<ShoppingCart>(
                    shoppingCartService.setShoppingCart(products), 
                    HttpStatus.CREATED);

    }
	
	@PutMapping
    public ResponseEntity<?> updateShoppingCartProducts(@RequestBody ShoppingCart products ){
            return new ResponseEntity<ShoppingCart>(
                    shoppingCartService.updateShoppingCart(products), 
                    HttpStatus.CREATED);

    }
	

	@DeleteMapping("{id}") //localhost:8080/api/customers/2
    public ResponseEntity<?> deleteShoppingCartById(@PathVariable("id") long idProduct) {

            return new ResponseEntity<String>(
                    shoppingCartService.deleteShoppingCart(idProduct), 
                    HttpStatus.OK);

    }

}
