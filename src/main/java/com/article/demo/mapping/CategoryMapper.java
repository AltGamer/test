package com.article.demo.mapping;

import com.article.demo.dto.CategoryDTO;
import com.article.demo.entity.Category;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapper {

    public Category mapCategoryDTOToCategory(CategoryDTO categoryDTO) {
        return Category.builder()
                .name(categoryDTO.getName())
                .build();
    }

    public CategoryDTO mapCategoryToDTO(Category category) {
        return CategoryDTO.builder()
                .id(category.getId())
                .name(category.getName())
                .build();
    }

}