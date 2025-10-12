package com.example.springBootLearn.globalExceptinHandle;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/app/")
public class Main {


    @GetMapping("/get/global")
    public ResponseEntity<String> getFunction() {
        try {
            // Attempt to load a class that does not exist

            Class.forName("com.example.NonExistingClass");
        } catch (ClassNotFoundException e) {
            // This exception will be handled by your GlobalExceptionHandling in Spring Boot
            throw new RuntimeException(e);
        }
        return ResponseEntity.ok("hii");
    }
}
