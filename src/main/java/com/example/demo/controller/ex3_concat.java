package com.example.demo.controller;

import com.example.demo.controller.ex3.op;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/ex3")
public class ex3_concat{
    @PostMapping("/concat")
    public String concat(@RequestBody concat concat) {
        return concat.a + concat.b;
    }
}