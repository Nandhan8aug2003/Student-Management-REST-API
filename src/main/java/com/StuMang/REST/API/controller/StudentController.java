package com.StuMang.REST.API.controller;

import com.StuMang.REST.API.entity.Student;
import com.StuMang.REST.API.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;

    StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    //create
    @PostMapping("/create")
    public void createStudent(@RequestBody Student student){
        System.out.println(student.getName());
    }

    //read

    //update

    //delete


}
