package main.java.com.inventiq.backend.controller;

import com.inventiq.backend.model.Cart;
import com.inventiq.backend.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    // Add to cart
    @PostMapping("/add")
    public Cart addToCart(@RequestBody Cart cart) {
        return cartService.addToCart(cart);
    }

    // Get cart
    @GetMapping
    public List<Cart> getCart(@RequestParam Long buyerId) {
        return cartService.getCart(buyerId);
    }

    // Update cart
    @PutMapping("/update")
    public Cart updateCart(@RequestBody Cart cart) {
        return cartService.updateCart(cart);
    }

    // Remove item
    @DeleteMapping("/remove/{productId}")
    public String removeFromCart(@PathVariable Long productId) {
        cartService.removeFromCart(productId);
        return "Item removed from cart";
    }

}