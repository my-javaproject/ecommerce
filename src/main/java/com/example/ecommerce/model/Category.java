package com.example.ecommerce.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Table(name="categories")
@Data
public class Category {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "category_name")
    private @NotBlank String categoryName;

    private @NotBlank String description;

    private @NotBlank String imageUrl;
}
