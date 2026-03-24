package main.java.com.inventiq.backend.service;

import com.inventiq.backend.model.Cart;
import com.inventiq.backend.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public Cart addToCart(Cart cart) {
        return cartRepository.save(cart);
    }

    public List<Cart> getCart(Long buyerId) {
        return cartRepository.findByBuyerId(buyerId);
    }

    public Cart updateCart(Cart cart) {
        return cartRepository.save(cart);
    }

    public void removeFromCart(Long productId) {
        cartRepository.deleteByProductId(productId);
    }

}