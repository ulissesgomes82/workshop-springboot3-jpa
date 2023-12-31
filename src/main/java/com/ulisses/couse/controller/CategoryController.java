package com.ulisses.couse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ulisses.couse.entities.Category;
import com.ulisses.couse.services.CategoryService;

@RestController
@RequestMapping(value = "/categorys")
public class CategoryController {

	@Autowired
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		return ResponseEntity.ok(service.findAll());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		return ResponseEntity.ok(service.findById(id));
	}
}
