package com.example.demo.controller;

import com.example.demo.dto.ResponseDTO;
import com.example.demo.dto.TestRequestBodyDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController //웹에서 오는 요청을 처리함
@RequestMapping("test") //url을 지정해주는 어노테이션
public class TestController {
    @GetMapping("/testGetMapping")
    public String testController() {
        return "Hello World!, 김다희";
    }

    @GetMapping("/{id}")
    public String testControllerWithPathVariables(@PathVariable(required = false) int id) {

        return "Hello World, 김다희" + id;
    }

    @GetMapping("/testRequestParam")
    public String testControllerRequestParam(@RequestParam(required = false) int id) {
        return "Hello World, 김다희" + id;

    }

    @GetMapping("/testRequestBody")
    public String testControllerRequestBody(@RequestBody TestRequestBodyDTO testRequestBodyDTO) {
        return "Hello World, 김다희" + testRequestBodyDTO.getId() + " Message : " + testRequestBodyDTO.getMessage();

    }

    @GetMapping("/testResponseBody")
    public ResponseDTO<String> testControllerResponseBody() {
        List<String> list = new ArrayList<>();
        list.add("Hello World! I'm ResponseDTO");
        list.add("kimdahee");
        list.add("25");
        ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();
        return response;
    }

    @GetMapping("/testResponseEntity")
    public ResponseEntity<?> testControllerResponseEntity() {
        List<String> list = new ArrayList<>();
        list.add("Hello World! I'm ResponseDTO");
        list.add("kimdahee");
        list.add("25");
        ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();
        //return ResponseEntity.ok().body(response);
        return ResponseEntity.badRequest().body(response);
    }

}
