package com.ulisses.couse.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ulisses.couse.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Ulisses", "ulisses@gmail.com", "85997002361", "123456");
		return ResponseEntity.ok(u);
	}
}
