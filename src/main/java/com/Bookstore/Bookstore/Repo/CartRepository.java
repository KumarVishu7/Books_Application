package com.Bookstore.Bookstore.Repo;

import com.Bookstore.Bookstore.Entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Long> {
    List<Cart> findByUserId(Long userId);
}

