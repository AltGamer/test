package com.article.demo.service;

import com.article.demo.entity.Article;

import java.util.List;

public interface ArticleService {

    Article createArticle(Article article);

    void deleteArticle(Integer id);

    List<Article> getArticles();

}