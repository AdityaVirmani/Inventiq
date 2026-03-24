package main.java.com.inventiq.backend.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    private Long sellerId;

    private String productName;

    private double price;

    private int availableQuantity;

    private LocalDate expiryDate;

    public Product() {}

    // getters and setters
}