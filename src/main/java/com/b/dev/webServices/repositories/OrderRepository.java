package com.b.dev.webServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.b.dev.webServices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
