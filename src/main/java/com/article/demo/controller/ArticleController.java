package com.article.demo.controller;

import com.article.demo.dto.ArticleDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(path = "/articles")
public class ArticleController {

    @GetMapping("/create")
    public ModelAndView createArticlePage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("article_creation");
        return modelAndView;
    }

    @PostMapping
    public ResponseEntity createArticle(@RequestBody final ArticleDTO dto) {
        System.out.println(dto.con());
        return ResponseEntity.status(HttpStatus.OK).body("OK");
    }

}