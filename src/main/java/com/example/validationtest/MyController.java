package com.example.validationtest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class MyController {

    @PostMapping(path = "/test")
    public ResponseEntity<String> test(@Valid @RequestBody MyRequestBody myRequestBody) {
        return ResponseEntity.ok("ok");
    }

}
