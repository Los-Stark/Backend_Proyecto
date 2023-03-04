package org.generation.app.controller;

import java.util.List;



import org.generation.app.model.Products;
import org.generation.app.service.IProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/products")
public class ProductsController {
	//prueba de commit
	@Autowired
	IProductsService productsService;
	
	
	@GetMapping("{id}")
	public Products getProductsById(@PathVariable("id") long idProduct) {
		return productsService.getProductById(idProduct);
		
	}
	
	@GetMapping
	public List<Products> getAllProducts(){
		return productsService.getAllProducts();
		
	}
	
	@PostMapping //localhost:8080/api/customers
    public ResponseEntity<?> setNewProducts(@RequestBody Products products) {
 
            return new ResponseEntity<Products>(
                    productsService.setProduct(products), 
                    HttpStatus.CREATED);

    }
	
	@PutMapping
    public ResponseEntity<?> updateProducts(@RequestBody Products products ){
            return new ResponseEntity<Products>(
                    productsService.updateProduct(products), 
                    HttpStatus.CREATED);

    }
	
	@PutMapping("/{idProduct}/size/{idProductSize}")
    public Products assignProducts(
            @PathVariable Long idProduct,
            @PathVariable Long idProductSize
    ){
        return productsService.assignProductsSize(idProduct, idProductSize);
    }

	
	

}
