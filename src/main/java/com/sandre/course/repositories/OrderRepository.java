package com.sandre.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sandre.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
