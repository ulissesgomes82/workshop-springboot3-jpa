package com.ulisses.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ulisses.couse.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
