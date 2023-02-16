package com.article.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping(path = "/files")
public class FileController {

    @Autowired
    private HttpServletRequest request;

    @GetMapping("/add")
    public ModelAndView addFilePage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("file_upload");
        return modelAndView;
    }

    @PostMapping
    public ResponseEntity uploadFile(@RequestParam("file") MultipartFile multipartFile) {
        System.out.println(multipartFile.getOriginalFilename());

        try {
            File file = new File(new File("src/main/resources/static/img/" + multipartFile.getOriginalFilename()).getCanonicalPath());
            multipartFile.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return ResponseEntity.status(HttpStatus.OK).body("OK");
    }

}