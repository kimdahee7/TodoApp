package com.example.demo.controller;

import com.example.demo.dto.TodoDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("todo")
public class TodoController {
    @GetMapping("/testTodo")
    public ResponseEntity<?> testTodo() {

        TodoDTO response = TodoDTO.builder().id("123").title("김다희").done(true).build();
        return ResponseEntity.ok().body(response);

        /*
        다른 방법
        TodoDTO todoDTO = new TodoDTO();

        todoDTO.setId("123");
        todoDTO.setTitle("김다희");
        todoDTO.setDone(true);

        return ResponseEntity.ok().body(todoDTO);

        */

    }
}
