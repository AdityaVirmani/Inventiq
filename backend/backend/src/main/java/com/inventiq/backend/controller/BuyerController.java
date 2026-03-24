package main.java.com.inventiq.backend.controller;

import com.inventiq.backend.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/buyer")
public class BuyerController {

    @Autowired
    private BuyerService buyerService;

    // Buyer Dashboard
    @GetMapping("/dashboard")
    public Object getBuyerDashboard(@RequestParam Long buyerId) {
        return buyerService.getDashboard(buyerId);
    }

}