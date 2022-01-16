package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts () {
        return this.productRepository.findAll();
    }

    public void addProduct (Product product) {
        this.productRepository.save(product);
    }

    public void saveProduct (Product product) {
        Product updatedProduct = this.productRepository.findById(product.getId()).orElse(null);
        updatedProduct.setCode(product.getCode());
        updatedProduct.setDescription(product.getDescription());
        updatedProduct.setColor(product.getColor());
        updatedProduct.setHeight(product.getHeight());
        updatedProduct.setWidth(product.getWidth());
        updatedProduct.setTall(product.getTall());
        updatedProduct.setValue(product.getValue());
        this.productRepository.save(updatedProduct);
    }

    public void  deleteProduct (Long id) {
        this.productRepository.deleteById(id);
    }
}
