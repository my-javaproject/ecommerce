package com.example.ecommerce.service;


import com.example.ecommerce.Repository.UserRepository;
import com.example.ecommerce.model.User;
import com.example.ecommerce.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtUtil jwtUtil;
    public User registerUser(User user) {
        return userRepository.save(user);
    }

    public String loginUser(User user) {
        Optional<User> user1 = userRepository.findByUsername(user.getUsername());
        if (user1.get().getUsername().matches(user.getUsername())) {
            return jwtUtil.generateToken(user1.get().getUsername());
        } else{
            throw new UsernameNotFoundException("Invalid username or password");
        }
    }
}
