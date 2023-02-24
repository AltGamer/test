package com.article.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(path = "/dashboard")
public class DashboardPageController {

    @GetMapping
    public ModelAndView getDashboard() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("dashboard");
        return modelAndView;
    }

}