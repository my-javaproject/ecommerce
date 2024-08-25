package com.example.ecommerce.service;

import com.example.ecommerce.Repository.CategoryRepository;
import com.example.ecommerce.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

}
