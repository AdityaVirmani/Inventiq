package main.java.com.inventiq.backend.repository;

import com.inventiq.backend.model.ProductCategoryRule;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CategoryRuleRepository extends JpaRepository<ProductCategoryRule, Long> {

    List<ProductCategoryRule> findByProductId(Long productId);

}