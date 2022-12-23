package com.pixel.controller;

import com.pixel.exception.StudentNotFoundException;
import com.pixel.studb.StudentDataBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentDataBase studentDataBase;


}
