package com.sandre.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sandre.course.entities.OrderItem;
import com.sandre.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
