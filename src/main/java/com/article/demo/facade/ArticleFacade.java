package com.article.demo.facade;

import com.article.demo.dto.ArticleDTO;
import com.article.demo.entity.Article;

import java.util.List;

public interface ArticleFacade {

    Article createArticle(ArticleDTO articleDTO);

    List<ArticleDTO> getArticles();

}