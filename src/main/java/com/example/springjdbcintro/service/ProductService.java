package com.example.springjdbcintro.service;

import com.example.springjdbcintro.model.Product;
import com.example.springjdbcintro.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public void showAllProducts() {
        List<Product> products = repository.findAll();
        products.forEach(System.out::println);
    }

    public void addSampleProduct() {
        repository.save(new Product("Monitor", 1200.00));
        System.out.println("✅ Produto 'Monitor' adicionado com sucesso!");
    }
}
