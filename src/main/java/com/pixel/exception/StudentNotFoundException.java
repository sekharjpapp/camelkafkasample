package com.pixel.exception;

public class StudentNotFoundException extends RuntimeException{

    public StudentNotFoundException(Integer id) {
        super("Could not found " + id);
    }
}
