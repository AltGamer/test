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

}