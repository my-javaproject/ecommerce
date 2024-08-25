package com.example.ecommerce.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String email;
    private UserRole role;
    @Lob
    @Column(columnDefinition = "longblob")
    private byte[] image;

}
