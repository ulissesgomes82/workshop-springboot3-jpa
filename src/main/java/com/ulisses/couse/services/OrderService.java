package com.ulisses.couse.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ulisses.couse.entities.Order;
import com.ulisses.couse.repositories.OrderRepository;
import com.ulisses.couse.services.exceptions.ResourceNotFoundException;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	public List<Order> findAll() {
		return repository.findAll();
	}

	public Order findById(Long id) {
		Optional<Order> order = repository.findById(id);
		return order.orElseThrow(()-> new ResourceNotFoundException(id));
	}
}
