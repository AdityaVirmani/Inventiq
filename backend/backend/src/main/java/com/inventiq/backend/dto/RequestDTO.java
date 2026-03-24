package main.java.com.inventiq.backend.dto;

public class RequestDTO {

    private Long productId;
    private Long buyerId;
    private Long sellerId;
    private int requestedQuantity;
    private String requestedTransport;
    private String requestedPayment;

    public RequestDTO() {}

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public int getRequestedQuantity() {
        return requestedQuantity;
    }

    public void setRequestedQuantity(int requestedQuantity) {
        this.requestedQuantity = requestedQuantity;
    }

    public String getRequestedTransport() {
        return requestedTransport;
    }

    public void setRequestedTransport(String requestedTransport) {
        this.requestedTransport = requestedTransport;
    }

    public String getRequestedPayment() {
        return requestedPayment;
    }

    public void setRequestedPayment(String requestedPayment) {
        this.requestedPayment = requestedPayment;
    }

}