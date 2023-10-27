package org.generation.amenzon.service;

import java.util.List;
import java.util.Optional;

import org.generation.amenzon.model.Product;
import org.generation.amenzon.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	private final ProductRepository productRepository;
	
	//constructor
	@Autowired
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	//CRUD
	
	//GET ALL
	public List<Product> getProducts(){
		return productRepository.findAll();
	}
	//GET BY ID
	public Optional <Product> getProduct(Long id) {
		return productRepository.findById(id);
	}
	//DELETE BY ID
	public void deleteProduct(Long id) {
		if(productRepository.existsById(id)) {
			productRepository.deleteById(id);
		}else {
			throw new IllegalStateException("The product with the id does not exist");
		}
	
}
	//POST
	public void addProduct(Product product) {
		Optional <Product> productByCode = productRepository.findByCode(product.getCode());
		if (productByCode.isPresent()) {
			throw new IllegalStateException ("The product is already registered");
		}productRepository.save(product);
	
	}
	
	
	//PUT BY ID
	public Product updateProduct(Product product) {
		return productRepository.save(product);
	}
	
}
