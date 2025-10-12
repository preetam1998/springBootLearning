package com.example.springBootLearn.globalExceptinHandle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandling {

    @ExceptionHandler(ClassNotFoundException.class)
    public ResponseEntity<CustomException> classNotFountException(ClassNotFoundException ex) {
        CustomException error = new CustomException( HttpStatus.NOT_FOUND.toString(), ex.getMessage() != null ? ex.getMessage() : "class not found");
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<CustomException> exception(Exception ex) {
        CustomException error = new CustomException( HttpStatus.NO_CONTENT.toString(), ex.getMessage() != null ? ex.getMessage() : "Internal server error");
        return new ResponseEntity<>(error, HttpStatus.NOT_EXTENDED);
    }

}
