package com.article.demo.controller;

import com.article.demo.dto.CategoryDTO;
import com.article.demo.facade.CategoryFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(path = "/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryFacade categoryFacade;

    @GetMapping("/create")
    public ModelAndView createCategoryPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("category_creation");
        return modelAndView;
    }

    @PostMapping("/create")
    public ResponseEntity createCategory(@RequestBody final CategoryDTO categoryDTO) {
        System.out.println(categoryDTO.getName());

        categoryFacade.createCategory(categoryDTO);

        return ResponseEntity.status(HttpStatus.OK).body("OK");
    }

}