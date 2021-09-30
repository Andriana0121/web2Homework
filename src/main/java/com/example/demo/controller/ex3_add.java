package com.example.demo.controller;

import com.example.demo.controller.ex3.add;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/ex3add")
public class ex3_add {
    @PostMapping("/add")
    public Integer add(@RequestBody add numbers) {
        return numbers.a + numbers.b;
    }
}