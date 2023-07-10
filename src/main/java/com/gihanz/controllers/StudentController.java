package com.gihanz.controllers;

import com.gihanz.dtos.Student;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin
public class StudentController {

    @GetMapping("students")
    public List<Student> getStudentList() {

        return Student.getStudentList();
    }

}
