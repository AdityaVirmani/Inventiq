package main.java.com.inventiq.backend.model;

import jakarta.persistence.*;

@Entity
public class ProductCategoryRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ruleId;

    private Long productId;

    private String categoryName;

    private int minQuantity;

    private int maxQuantity;

    public ProductCategoryRule() {}

    // getters and setters
}