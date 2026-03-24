package main.java.com.inventiq.backend.controller;

import com.inventiq.backend.model.Wishlist;
import com.inventiq.backend.service.WishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/wishlist")
public class WishlistController {

    @Autowired
    private WishlistService wishlistService;

    // Add to wishlist
    @PostMapping("/add")
    public Wishlist addWishlist(@RequestBody Wishlist wishlist) {
        return wishlistService.addWishlist(wishlist);
    }

    // Get wishlist
    @GetMapping
    public List<Wishlist> getWishlist(@RequestParam Long buyerId) {
        return wishlistService.getWishlist(buyerId);
    }

    // Remove item
    @DeleteMapping("/remove/{productId}")
    public String removeWishlist(@PathVariable Long productId) {
        wishlistService.removeWishlist(productId);
        return "Removed from wishlist";
    }

}