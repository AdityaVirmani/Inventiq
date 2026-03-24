package main.java.com.inventiq.backend.controller;

import com.inventiq.backend.model.Product;
import com.inventiq.backend.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/seller")
public class SellerController {

    @Autowired
    private SellerService sellerService;

    // Add Product
    @PostMapping("/products/add")
    public Product addProduct(@RequestBody Product product) {
        return sellerService.addProduct(product);
    }

    // Get Seller Products
    @GetMapping("/products")
    public List<Product> getSellerProducts(@RequestParam Long sellerId) {
        return sellerService.getSellerProducts(sellerId);
    }

    // Delete Product
    @DeleteMapping("/products/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        sellerService.deleteProduct(id);
        return "Product deleted";
    }

}