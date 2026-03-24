package main.java.com.inventiq.backend.controller;

import com.inventiq.backend.model.Order;
import com.inventiq.backend.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    // Place Order
    @PostMapping("/place")
    public Order placeOrder(@RequestBody Order order) {
        return orderService.placeOrder(order);
    }

    // Buyer Orders
    @GetMapping("/buyer")
    public List<Order> getBuyerOrders(@RequestParam Long buyerId) {
        return orderService.getBuyerOrders(buyerId);
    }

}