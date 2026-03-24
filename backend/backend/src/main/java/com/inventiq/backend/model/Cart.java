package main.java.com.inventiq.backend.model;

import jakarta.persistence.*;

@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartId;

    private Long buyerId;

    private Long productId;

    private int quantity;

    public Cart() {}

    // getters and setters
}