package com.b.dev.webServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.b.dev.webServices.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}