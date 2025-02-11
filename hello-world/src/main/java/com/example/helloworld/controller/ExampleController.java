package com.example.helloworld.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Tag(name = "Example Controller", description = "Controller for example endpoints")
public class ExampleController {
    @Operation(summary = "Example endpoint")
    @GetMapping("/example")
    public ResponseEntity<String> exampleEndpoint() {
        return ResponseEntity.ok("Hello Swagger!");
    }
}