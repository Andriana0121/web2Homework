package com.example.demo.controller;

import com.example.demo.demo.controller.operat;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/ex3")
public class Ex3_op{
    @PostMapping("/op")
    public Double op(@RequestBody Op numbers) {
        double result = 0;
        switch (numbers.operation) {
            case "+":
                result = numbers.a + numbers.b;
                break;
            case "-":
                result = numbers.a - numbers.b;
                break;
            case "*":
                result = numbers.a * numbers.b;
                break;
            case "/":
                result = (double)numbers.a / (double)numbers.b;
                break;
            default:
                System.out.println("Not Found! choose another operation, like as = - * /");
                break;
        }
        return result;
    }
}