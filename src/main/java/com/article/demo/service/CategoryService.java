package com.article.demo.service;

import com.article.demo.entity.Category;

import java.util.List;

public interface CategoryService {

    Category createCategory(Category category);

    void deleteCategory(Integer categoryId);

    List<Category> getCategories();

}