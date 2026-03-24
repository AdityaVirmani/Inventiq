package main.java.com.inventiq.backend.service;

import com.inventiq.backend.model.Order;
import com.inventiq.backend.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order placeOrder(Order order) {

        order.setOrderStatus("PLACED");
        order.setCreatedAt(LocalDateTime.now());

        return orderRepository.save(order);
    }

    public List<Order> getBuyerOrders(Long buyerId) {
        return orderRepository.findByBuyerId(buyerId);
    }

}