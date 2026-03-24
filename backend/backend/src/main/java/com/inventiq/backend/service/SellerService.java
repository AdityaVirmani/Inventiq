package main.java.com.inventiq.backend.service;

import com.inventiq.backend.model.Product;
import com.inventiq.backend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerService {

    @Autowired
    private ProductRepository productRepository;

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getSellerProducts(Long sellerId) {
        return productRepository.findBySellerId(sellerId);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

}