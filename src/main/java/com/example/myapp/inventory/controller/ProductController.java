package com.example.myapp.inventory.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.inventory.model.Product;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @GetMapping
    public List<Product> getAllProducts() {
        return Arrays.asList(
            new Product(1L, "Laptop", 23467328.99),
            new Product(2L, "Smartphone", 126113.49),
            new Product(3L, "Headphones", 950.99),
            new Product(3L, "Clothes", 78359.99),
            new Product(3L, "Shoes", 3458.46),
            new Product(3L, "Electronics", 23467.99)
        );
    }
}
