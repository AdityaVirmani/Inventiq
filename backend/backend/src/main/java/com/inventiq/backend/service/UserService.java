package main.java.com.inventiq.backend.service;

import com.inventiq.backend.model.Product;
import com.inventiq.backend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public User register(User user){
        return repo.save(user);
    }
}