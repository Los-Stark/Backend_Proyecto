package org.generation.app.service;

import java.util.List;


import org.generation.app.model.Products;
import org.generation.app.repository.IProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsService implements IProductsService {

	@Autowired
	IProductsRepository productsRepository;
	
	@Override
	public Products getProductById(long idProduct) {
		return productsRepository.findById(idProduct);

	}


	@Override
	public List<Products> getAllProducts() {
		List<Products> allProducts = (List<Products>)productsRepository.findAll();
		return allProducts;
	}


	@Override
	public Products setProduct(Products product) {
		
        Products newProduct = product;
        newProduct.setIdProducts(0);
        return productsRepository.save(newProduct);
		
	}


	@Override
	public Products updateProduct(Products newDataProduct) {
		
		// Obtener los datos actuales del producto
        Products products = getProductById(newDataProduct.getIdProducts());
        //Actualizar los datos permitidos
        products.setCategory( newDataProduct.getCategory() );
        products.setImageURL( newDataProduct.getImageURL() );
        products.setName( newDataProduct.getName() );
        products.setPrice(newDataProduct.getPrice());

        return productsRepository.save(products);
		
	}
	

}
