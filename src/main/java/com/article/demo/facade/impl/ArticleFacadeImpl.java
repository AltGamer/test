package com.article.demo.facade.impl;

import com.article.demo.dto.ArticleDTO;
import com.article.demo.entity.Article;
import com.article.demo.entity.Category;
import com.article.demo.facade.ArticleFacade;
import com.article.demo.mapping.ArticleMapper;
import com.article.demo.mapping.CategoryMapper;
import com.article.demo.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class ArticleFacadeImpl implements ArticleFacade {

    private final ArticleService articleService;
    private final ArticleMapper articleMapper;
    private final CategoryMapper categoryMapper;

    @Override
    public Article createArticle(ArticleDTO articleDTO) {
        Article article = articleMapper.mapArticleDTOToArticle(articleDTO);
        Category category = categoryMapper.mapCategoryDTOToCategory(articleDTO.getCategory());
        category.setId(articleDTO.getCategory().getId());
        article.setCategory(category);
        articleService.createArticle(article);
        return article;
    }

    @Override
    public List<ArticleDTO> getArticles() {
        List<Article> articles = articleService.getArticles();
        return articles.stream().map(articleMapper::mapArticleToDTO).collect(Collectors.toList());
    }

}