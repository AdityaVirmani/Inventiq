package main.java.com.inventiq.backend.model;

import jakarta.persistence.*;

@Entity
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderItemId;

    private Long orderId;

    private Long productId;

    private int quantity;

    private double price;

    public OrderItem() {}

    // getters and setters
}