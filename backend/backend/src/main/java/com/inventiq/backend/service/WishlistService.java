package main.java.com.inventiq.backend.service;

import com.inventiq.backend.model.Wishlist;
import com.inventiq.backend.repository.WishlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class WishlistService {

    @Autowired
    private WishlistRepository wishlistRepository;

    public Wishlist addWishlist(Wishlist wishlist) {

        wishlist.setAddedAt(LocalDateTime.now());

        return wishlistRepository.save(wishlist);
    }

    public List<Wishlist> getWishlist(Long buyerId) {
        return wishlistRepository.findByBuyerId(buyerId);
    }

    public void removeWishlist(Long productId) {
        wishlistRepository.deleteByProductId(productId);
    }

}