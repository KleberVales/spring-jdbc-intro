package com.example.springjdbcintro.repository;

import com.example.springjdbcintro.model.Product;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {

    private final JdbcTemplate jdbcTemplate;

    public ProductRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private RowMapper<Product> productRowMapper = (rs, rowNum) -> {
        Product product = new Product();
        product.setId(rs.getLong("id"));
        product.setName(rs.getString("name"));
        product.setPrice(rs.getDouble("price"));
        return product;
    };

    public List<Product> findAll() {
        return jdbcTemplate.query("SELECT * FROM product", productRowMapper);
    }

    public Product findById(Long id) {
        return jdbcTemplate.queryForObject(
                "SELECT * FROM product WHERE id = ?",
                productRowMapper,
                id
        );
    }

    public int save(Product product) {
        return jdbcTemplate.update(
                "INSERT INTO product (name, price) VALUES (?, ?)",
                product.getName(),
                product.getPrice()
        );
    }

    public int update(Product product) {
        return jdbcTemplate.update(
                "UPDATE product SET name = ?, price = ? WHERE id = ?",
                product.getName(),
                product.getPrice(),
                product.getId()
        );
    }

    public int delete(Long id) {
        return jdbcTemplate.update(
                "DELETE FROM product WHERE id = ?",
                id
        );
    }
}
