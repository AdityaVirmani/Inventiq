package main.java.com.inventiq.backend.repository;

import com.inventiq.backend.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Long> {

    List<Cart> findByBuyerId(Long buyerId);

    void deleteByProductId(Long productId);

}