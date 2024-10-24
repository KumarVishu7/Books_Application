package com.Bookstore.Bookstore.Repo;

import com.Bookstore.Bookstore.Entities.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Orders, Long> {
    List<Orders> findByUserId(Long userId);
}

