package org.generation.app.service;

import java.util.List;

import org.generation.app.model.ProductSize;
import org.generation.app.model.Products;
import org.generation.app.repository.IProductSizeRepository;
import org.generation.app.repository.IProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductSizeService implements IProductSizeService {

	@Autowired
	IProductSizeRepository productSizeRepository;
	
	@Override
	public ProductSize getProductSizeById(long idTalla) {
		return productSizeRepository.findById(idTalla);
	}

	@Override
	public ProductSize setProductSize(ProductSize productSize) {
		
		ProductSize newSize = productSize;
        newSize.setIdTalla(0);
        return productSizeRepository.save(newSize);
	}

	@Override
	public ProductSize updateProductSize(ProductSize newDataProductSize) {
		
		// Obtener los datos actuales del producto
        ProductSize productSize = getProductSizeById(newDataProductSize.getIdTalla());
        //Actualizar los datos permitidos
        productSize.setTalla( newDataProductSize.getTalla() );

        return productSizeRepository.save(productSize);
	}

	@Override
	public List<ProductSize> getAllProductSize() {


		 List<ProductSize> allProductSizes = (List<ProductSize>) productSizeRepository.findAll();
	     return allProductSizes  ;
		
	}

	
	
}
