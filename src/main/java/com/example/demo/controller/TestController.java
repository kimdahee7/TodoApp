package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //웹에서 오는 요청을 처리함
@RequestMapping("test") //url을 지정해주는 어노테이션
public class TestController {
    @GetMapping("/testGetMapping")
    public String testController() {
        return "Hello World!, 김다희";
    }
    @GetMapping("/{id}")
    public String testControllerWithPathVariables(@PathVariable(required = false) int id) {

        return "Hello World, 김다희"+ id;
    }

}
