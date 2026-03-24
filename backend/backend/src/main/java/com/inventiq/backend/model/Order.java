package main.java.com.inventiq.backend.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private Long buyerId;

    private double totalAmount;

    private String orderStatus;

    private LocalDateTime createdAt;

    public Order() {}

    // getters and setters
}