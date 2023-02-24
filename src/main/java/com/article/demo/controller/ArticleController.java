package com.article.demo.controller;

import com.article.demo.dto.ArticleDTO;
import com.article.demo.dto.CategoryDTO;
import com.article.demo.facade.ArticleFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping(path = "/articles")
@RequiredArgsConstructor
public class ArticleController {

    private final ArticleFacade articleFacade;

    @GetMapping
    public ModelAndView articlesPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("articles");
        return modelAndView;
    }

    @GetMapping("/list")
    public ResponseEntity getArticles() {
        List<ArticleDTO> articles = articleFacade.getArticles();
        return ResponseEntity.ok().body(articles);
    }

    @GetMapping("/create")
    public ModelAndView createArticlePage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("article_creation");
        return modelAndView;
    }

    @PostMapping("/create")
    public ResponseEntity createArticle(@RequestBody final ArticleDTO articleDTO) {
        System.out.println(articleDTO.getTitle());
        System.out.println(articleDTO.getContent());
        System.out.println(articleDTO.getCategory().getId());
        System.out.println(articleDTO.getCategory().getName());

        articleFacade.createArticle(articleDTO);

        return ResponseEntity.status(HttpStatus.OK).body("OK");
    }

}