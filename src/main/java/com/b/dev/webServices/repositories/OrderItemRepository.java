package com.b.dev.webServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.b.dev.webServices.entities.OrderItem;
import com.b.dev.webServices.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}