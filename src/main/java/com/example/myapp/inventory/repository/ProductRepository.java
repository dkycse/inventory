package com.example.myapp.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.myapp.inventory.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
