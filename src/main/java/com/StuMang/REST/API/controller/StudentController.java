package com.StuMang.REST.API.controller;

import com.StuMang.REST.API.entity.Student;
import com.StuMang.REST.API.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/get/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id){
        Student stuGet = studentService.getStudent(id);

        if(stuGet != null) {
            return ResponseEntity
                    .status(200).body(stuGet);
        }

        return ResponseEntity.notFound().build();
    }
    //update

    //delete


}
