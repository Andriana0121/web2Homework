package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public  class Ex1_c {
    @GetMapping("ex1c")
    public String method3(HttpServletRequest httpServletRequest) {
        return "URL-ul absolut al cererii HTTP -> getRequestURL: " + httpServletRequest.getRequestURL();
    }
}