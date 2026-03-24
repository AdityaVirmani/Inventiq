package main.java.com.inventiq.backend.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class BuyerService {

    public Map<String, Object> getDashboard(Long buyerId) {

        Map<String, Object> dashboard = new HashMap<>();

        dashboard.put("buyerId", buyerId);
        dashboard.put("message", "Buyer Dashboard Loaded");

        return dashboard;
    }

}