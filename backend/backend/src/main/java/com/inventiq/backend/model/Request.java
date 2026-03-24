package main.java.com.inventiq.backend.model;

import jakarta.persistence.*;

@Entity
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long requestId;

    private Long buyerId;

    private Long sellerId;

    private Long productId;

    private String category;

    private int requestedQuantity;

    private String requestedTransport;

    private String requestedPayment;

    private double sellerPrice;

    private double sellerTransportCharge;

    private String requestStatus;

    public Request() {}

    // getters and setters
}