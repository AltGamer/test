package com.article.demo.facade;

import com.article.demo.dto.CategoryDTO;
import com.article.demo.entity.Category;

public interface CategoryFacade {

    Category createCategory(CategoryDTO categoryDTO);

}