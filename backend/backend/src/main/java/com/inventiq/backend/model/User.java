package main.java.com.inventiq.backend.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String name;

    private String email;

    private String password;

    private String role;

    private String phone;

    private LocalDateTime createdAt;

    public User() {}

    // getters and setters
}