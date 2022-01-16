package com.example.demo.product;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ProductConfig {
    @Bean
    CommandLineRunner commandLineRunner (ProductRepository productRepository) {
        return products -> {
            Product p1 =  new Product(1, "Chair","green", 10,10,10,220000);
            Product p2 = new Product(2, "Table","black", 100,100,100,4220000);
            Product p3 = new Product(3, "PC","grey", 22,15,4,1206000.500);
            productRepository.saveAll(List.of(p1,p2,p3));
        };
    }
}
