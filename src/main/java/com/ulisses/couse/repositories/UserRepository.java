package com.ulisses.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ulisses.couse.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
