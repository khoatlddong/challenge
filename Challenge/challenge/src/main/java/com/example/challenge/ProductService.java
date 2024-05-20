package com.example.challenge;

import com.example.challenge.entity.Product;
import com.example.challenge.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Page<Product> getAllProduct(Pageable pageable){
        return productRepository.findAll(pageable);
    }

    public Optional<Product> getProductById(int id){
        return productRepository.findById(id);
    }

    public Product createProduct(Product product){
        return productRepository.save(product);
    }

    public Product updateProduct(int id, Product product){
        product.setId(id);
        return productRepository.save(product);
    }

    public void deleteProductById(int id){
        productRepository.deleteById(id);
    }
}
