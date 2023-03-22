package com.example.demo.controller;

import com.example.demo.dto.ResponseDTO;
import com.example.demo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("todo")
public class TodoController {
    @Autowired
    private TodoService service;

    @GetMapping("/test")
    public ResponseEntity<?> testTodo() {
        String str = service.testService();

        List<String> list = new ArrayList<>();
        list.add(str);

        ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();
        return ResponseEntity.ok().body(response);
    }
     /*
    @GetMapping("/testTodo")
    public ResponseEntity<?> testTodo() {

        TodoDTO response = TodoDTO.builder().id("123").title("김다희").done(true).build();
        return ResponseEntity.ok().body(response);

        다른 방법
        TodoDTO todoDTO = new TodoDTO();

        todoDTO.setId("123");
        todoDTO.setTitle("김다희");
        todoDTO.setDone(true);

        return ResponseEntity.ok().body(todoDTO);

        */

}
