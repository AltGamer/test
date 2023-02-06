package com.article.demo.controller;

import com.article.demo.entity.Article;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/dashboard")
public class DashboardPageController {

    @GetMapping
    public String getDashboard() {

        //Article article = new Article();
        //article.setContent("");

        return "Dashboard Page";
    }

}