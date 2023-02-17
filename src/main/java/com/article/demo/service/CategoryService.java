package com.article.demo.service;

import com.article.demo.entity.Category;

public interface CategoryService {

    Category createCategory(Category category);

    void deleteCategory(Integer categoryId);

}