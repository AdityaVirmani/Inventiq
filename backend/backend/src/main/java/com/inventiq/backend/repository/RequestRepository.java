package main.java.com.inventiq.backend.repository;

import com.inventiq.backend.model.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface RequestRepository extends JpaRepository<Request, Long> {

    List<Request> findByBuyerId(Long buyerId);

    List<Request> findBySellerId(Long sellerId);

}