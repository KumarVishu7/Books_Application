package com.Bookstore.Bookstore.Service;

import com.Bookstore.Bookstore.Entities.Orders;
import com.Bookstore.Bookstore.Repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private  OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Orders> getOrdersByUserId(Long userId) {
        return orderRepository.findByUserId(userId);
    }

    public Orders placeOrder(Long userId, Double totalPrice) {
        Orders order = new Orders();
        order.setUserId(userId);
        order.setTotalPrice(totalPrice);
        order.setStatus("pending");
        order.setOrderDate(new Date());
        return orderRepository.save(order);
    }

    public Orders updateOrderStatus(Long id, String status) {
        Orders order = orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found"));
        order.setStatus(status);
        return orderRepository.save(order);
    }
}

