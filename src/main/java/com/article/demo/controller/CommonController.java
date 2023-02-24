package com.article.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(path = "/home")
public class CommonController {

    @GetMapping
    public ModelAndView redirectToHome() {
        return new ModelAndView("redirect:/");
    }

}