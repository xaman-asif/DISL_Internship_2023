package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {

//    @org.springframework.web.bind.annotation.ExceptionHandler(IllegalStateException.class)
//    public ResponseEntity<Object> handleIlligalArgumentException(IllegalStateException exception){
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception.getMessage());
//    }
}
