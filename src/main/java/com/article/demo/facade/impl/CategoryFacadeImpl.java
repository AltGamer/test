package com.article.demo.facade.impl;

import com.article.demo.dto.CategoryDTO;
import com.article.demo.entity.Category;
import com.article.demo.facade.CategoryFacade;
import com.article.demo.mapping.CategoryMapper;
import com.article.demo.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CategoryFacadeImpl implements CategoryFacade {

    private final CategoryService categoryService;
    private final CategoryMapper categoryMapper;

    @Override
    public Category createCategory(CategoryDTO categoryDTO) {
        Category category = categoryMapper.mapCategoryDTOToCategory(categoryDTO);
        categoryService.createCategory(category);
        return category;
    }

}