package com.article.demo.mapping;

import com.article.demo.dto.ArticleDTO;
import com.article.demo.entity.Article;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ArticleMapper {

    private final CategoryMapper categoryMapper;

    public Article mapArticleDTOToArticle(ArticleDTO articleDTO) {
        return Article.builder()
                .title(articleDTO.getTitle())
                .content(articleDTO.getContent())
                .status("DRAFT")
                .build();
    }

    public ArticleDTO mapArticleToDTO(Article article) {
        return ArticleDTO.builder()
                .id(article.getId())
                .title(article.getTitle())
                .content(article.getContent())
                .status(article.getStatus())
                .category(categoryMapper.mapCategoryToDTO(article.getCategory()))
                .build();
    }

}