package com.Bookstore.Bookstore.Controller;

import com.Bookstore.Bookstore.Entities.Orders;
import com.Bookstore.Bookstore.Service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/{userId}")
    public List<Orders> getUserOrders(@PathVariable Long userId) {
        return orderService.getOrdersByUserId(userId);
    }

    @PostMapping
    public Orders placeOrder(@RequestParam Long userId, @RequestParam Double totalPrice) {
        return orderService.placeOrder(userId, totalPrice);
    }

    @PutMapping("/{id}")
    public Orders updateOrderStatus(@PathVariable Long id, @RequestParam String status) {
        return orderService.updateOrderStatus(id, status);
    }
}

