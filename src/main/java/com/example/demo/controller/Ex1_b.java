package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class Ex1_b {
    @GetMapping("ex1b")
    public String method2(HttpServletRequest httpServletRequest) {
        return  "URL-ul metodei mapate relativ la adresa aplicației -> getRequests: "  + httpServletRequest . getRequests ();
    }

}
