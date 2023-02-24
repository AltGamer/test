package com.article.demo.facade;

import com.article.demo.dto.CategoryDTO;
import com.article.demo.entity.Category;

import java.util.List;

public interface CategoryFacade {

    Category createCategory(CategoryDTO categoryDTO);

    List<CategoryDTO> getCategories();

}