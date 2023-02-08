package com.article.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/home")
public class HomePageController {

    @GetMapping
    public String getHome() {
        return "It is Wednesday My Dudes https://reactor.cc/post/5462363";
    }

}