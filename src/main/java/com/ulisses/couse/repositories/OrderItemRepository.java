package com.ulisses.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ulisses.couse.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
