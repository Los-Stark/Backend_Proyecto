package org.generation.app.service;

import java.util.List;
import java.util.Set;

import org.generation.app.model.ProductSize;
import org.generation.app.model.Products;
import org.generation.app.repository.IProductSizeRepository;
import org.generation.app.repository.IProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsService implements IProductsService {

	@Autowired
	IProductsRepository productsRepository;
	@Autowired
	IProductSizeRepository productSizeRepository;
	
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


	@Override
	public Products assignProductsSize(long idProduct, long idProductSize) {
		Set<ProductSize> productSet = null;
		Products products = productsRepository.findById(idProduct);
		ProductSize productsSize = productSizeRepository.findById(idProductSize);
		productSet = products.getAssignProductSizes();
		productSet.add(productsSize);
		products.setAssignProductSizes(productSet);
		return productsRepository.save(products);
		
	}
	

}
