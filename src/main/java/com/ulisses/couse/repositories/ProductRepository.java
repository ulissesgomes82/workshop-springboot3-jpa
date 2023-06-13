package com.ulisses.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ulisses.couse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
