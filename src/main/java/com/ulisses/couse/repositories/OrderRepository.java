package com.ulisses.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ulisses.couse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
