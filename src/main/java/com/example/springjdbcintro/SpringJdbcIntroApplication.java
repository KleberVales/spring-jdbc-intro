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

/* -Criar uma tabela com os seguintes itens

            Product{id=1, name='Notebook', price=3500.0}
            Product{id=2, name='Mouse', price=150.0}
            Product{id=3, name='Teclado', price=200.0}

    - Atualizar a tabela e mostrar a tabela atualizada

            Product{id=1, name='Notebook', price=3500.0}
            Product{id=2, name='Mouse', price=150.0}
            Product{id=3, name='Teclado', price=200.0}
            Product{id=4, name='Monitor', price=1200.0}
 */
