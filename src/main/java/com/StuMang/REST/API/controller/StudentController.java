package com.StuMang.REST.API.controller;

import com.StuMang.REST.API.entity.Student;
import com.StuMang.REST.API.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Student> createStudent(@RequestBody Student stuCreReq){
        Student steRet = studentService.createStudent(stuCreReq);
        return ResponseEntity.status(HttpStatus.CREATED).body(steRet);
    }

    //read

    //update

    //delete


}
