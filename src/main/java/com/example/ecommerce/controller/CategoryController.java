package com.example.ecommerce.controller;

import com.example.ecommerce.model.Category;
import com.example.ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @PostMapping("/store")
    public Category saveCategory(@RequestBody Category category) {
        return categoryService.createCategory(category);
    }
}
