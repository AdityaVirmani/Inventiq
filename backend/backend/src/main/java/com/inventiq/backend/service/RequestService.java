package main.java.com.inventiq.backend.service;

import com.inventiq.backend.model.Request;
import com.inventiq.backend.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestService {

    @Autowired
    private RequestRepository requestRepository;

    public Request sendRequest(Request request) {
        request.setRequestStatus("PENDING");
        return requestRepository.save(request);
    }

    public List<Request> getBuyerRequests(Long buyerId) {
        return requestRepository.findByBuyerId(buyerId);
    }

    public List<Request> getSellerRequests(Long sellerId) {
        return requestRepository.findBySellerId(sellerId);
    }

    public Request updateRequest(Long id, Request request) {

        Request existing = requestRepository.findById(id).orElse(null);

        if (existing != null) {
            existing.setSellerPrice(request.getSellerPrice());
            existing.setSellerTransportCharge(request.getSellerTransportCharge());
            existing.setRequestStatus(request.getRequestStatus());

            return requestRepository.save(existing);
        }

        return null;
    }

}