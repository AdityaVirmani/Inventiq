package main.java.com.inventiq.backend.repository;

import com.inventiq.backend.model.Wishlist;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface WishlistRepository extends JpaRepository<Wishlist, Long> {

    List<Wishlist> findByBuyerId(Long buyerId);

    void deleteByProductId(Long productId);

}