package com.example.ecommerce.controller;


import com.example.ecommerce.model.User;
import com.example.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/registerUser")
    public ResponseEntity<User> registerUser(User user) {
        return new ResponseEntity<>(userService.registerUser(user), HttpStatus.OK);
    }
    @PostMapping("/login")
    public ResponseEntity<String> loginUser(User user) {
        String token = userService.loginUser(user);
        return ResponseEntity.ok(token);
    }
}
