package com.example.demo.controller;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import  java.util.Objects ;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class Ex2 {
    private static final String MY_COOKIE = "cookieForIS31Z";

    @GetMapping("/cookies/add")
    public String addCookie(HttpServletResponse response) {
        Cookie uiColorCookie = new
                Cookie(MY_COOKIE, "keep_calm_and_do_programming");
        response.addCookie(uiColorCookie);
        return "Cookie added, please check!";
    }

    @GetMapping("/cookies/my-cookie")
    public String addCookie(HttpServletRequest request, @CookieValue(name
            = MY_COOKIE, required = false) String cookieValue) {
        return "My cookie value is:" + Objects.toString(cookieValue);
    }

    @GetMapping("/cookies/ex2")
    public String method2(HttpServletRequest httpServletRequest) {
        return "Afiseaza lista de antete cerere: " + httpServletRequest.getHeader("antete");
    }

    @GetMapping("/cookies/ex3")
    public String method3(HttpServletRequest httpServletRequest) {
        return "Afiseaza lista de parametri din query string: " + httpServletRequest.getHeaderNames().toString();
    }
}
