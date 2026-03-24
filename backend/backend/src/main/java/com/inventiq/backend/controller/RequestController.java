package main.java.com.inventiq.backend.controller;

import com.inventiq.backend.model.Request;
import com.inventiq.backend.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/requests")
public class RequestController {

    @Autowired
    private RequestService requestService;

    // Send Request
    @PostMapping("/send")
    public Request sendRequest(@RequestBody Request request) {
        return requestService.sendRequest(request);
    }

    // Buyer Requests
    @GetMapping("/buyer")
    public List<Request> getBuyerRequests(@RequestParam Long buyerId) {
        return requestService.getBuyerRequests(buyerId);
    }

    // Seller Requests
    @GetMapping("/seller")
    public List<Request> getSellerRequests(@RequestParam Long sellerId) {
        return requestService.getSellerRequests(sellerId);
    }

    // Update Request
    @PutMapping("/update/{id}")
    public Request updateRequest(@PathVariable Long id, @RequestBody Request request) {
        return requestService.updateRequest(id, request);
    }

}