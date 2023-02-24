package com.article.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArticleDTO {

    private Integer id;

    @NotEmpty
    private String title;

    @NotEmpty
    private String content;

    private String status;

    @NotEmpty
    private CategoryDTO category;

}