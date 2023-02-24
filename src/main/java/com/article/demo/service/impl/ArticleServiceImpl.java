package com.article.demo.service.impl;

import com.article.demo.entity.Article;
import com.article.demo.repository.ArticleRepository;
import com.article.demo.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository articleRepository;

    @Override
    public Article createArticle(Article article) {
        articleRepository.save(article);
        return article;
    }

    @Override
    public void deleteArticle(Integer id) {

    }

    @Override
    public List<Article> getArticles() {
        return articleRepository.findAll();
    }

}