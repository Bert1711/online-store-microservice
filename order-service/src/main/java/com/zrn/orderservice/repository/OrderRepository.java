package com.zrn.orderservice.repository;

import com.zrn.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Zaroyan
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
