package com.article.demo.service.impl;

import com.article.demo.entity.Category;
import com.article.demo.repository.CategoryRepository;
import com.article.demo.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository repository;

    @Override
    public Category createCategory(Category category) {
        repository.save(category);
        return category;
    }

    @Override
    public void deleteCategory(Integer categoryId) {

    }

}