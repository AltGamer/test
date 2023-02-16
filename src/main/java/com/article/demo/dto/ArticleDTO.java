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

    @NotEmpty
    private String title;

    @NotEmpty
    private String content;

    public String con() {
        return title + content;
    }

}