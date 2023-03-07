package org.generation.app.controller;

import java.util.List;


import org.generation.app.model.ProductSize;
import org.generation.app.service.IProductSizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/size")
@CrossOrigin(origins="*")
public class ProductSizeController {

	@Autowired
	IProductSizeService productSizeService;
	
	@GetMapping("{id}")
	public ProductSize getProductSizeById(@PathVariable("id") long idTalla) {
		return productSizeService.getProductSizeById(idTalla);
		
	}
	
	@GetMapping
	public List<ProductSize> getAllProductSize(){
		return productSizeService.getAllProductSize();
		
	}
	
	@PostMapping //localhost:8080/api/customers
    public ResponseEntity<?> setNewProductSize(@RequestBody ProductSize productSize) {
        
		return new ResponseEntity<ProductSize>  (
                productSizeService.setProductSize(productSize), 
                HttpStatus.CREATED);
		
    }
	
}
