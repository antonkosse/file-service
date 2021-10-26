package com.example.fileservice.exception_handling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.nio.file.NoSuchFileException;

@ControllerAdvice
public class FileServiceGlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<String> handleException(NoSuchFileException exception) {
        return new ResponseEntity<>("Couldn't find specified file/directory: " + exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler
    public ResponseEntity<String> handleException(Exception exception) {
        return new ResponseEntity<>("Something went wrong: " + exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
