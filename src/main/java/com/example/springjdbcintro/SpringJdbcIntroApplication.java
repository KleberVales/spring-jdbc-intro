package com.example.springjdbcintro;

import com.example.springjdbcintro.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJdbcIntroApplication implements CommandLineRunner {

    private final ProductService productService;

    public SpringJdbcIntroApplication(ProductService productService) {
        this.productService = productService;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringJdbcIntroApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("📦 Lista inicial de produtos:");
        productService.showAllProducts();

        productService.addSampleProduct();

        System.out.println("\n📦 Lista atualizada de produtos:");
        productService.showAllProducts();
    }
}
