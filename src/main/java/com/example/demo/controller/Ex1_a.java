package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@RestController
public class Ex1_a {
    @GetMapping("ex1_a")
    public String method1(HttpServletRequest httpServletRequest) {
        return "URL-ul aplicației relativ la adresa serverului -> getServletPath: " + httpServletRequest.getServletPath();
    }
}
