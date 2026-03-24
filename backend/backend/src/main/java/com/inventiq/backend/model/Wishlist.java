package main.java.com.inventiq.backend.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Wishlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long wishlistId;

    private Long buyerId;

    private Long productId;

    private LocalDateTime addedAt;

    public Wishlist() {}

    // getters and setters
}