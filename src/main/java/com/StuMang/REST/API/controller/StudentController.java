package com.StuMang.REST.API.controller;

import com.StuMang.REST.API.entity.Student;
import com.StuMang.REST.API.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//handles request and response.
@RestController
@RequestMapping("/api/students") //setting endpoint which is same through out
public class StudentController {

    //dependency injection instead of @autowired.
    private StudentService studentService;

    StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    //createStudent
    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody Student stuCreReq){
        Student steRet = studentService.createStudent(stuCreReq);
        return ResponseEntity.status(HttpStatus.CREATED).body(steRet);
    }

    //getStudent
    @GetMapping("/get/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id){
        Student stuGet = studentService.getStudent(id);

        if(stuGet != null) {
            return ResponseEntity
                    .status(200).body(stuGet);
        }
        return ResponseEntity.notFound().build();
    }

    //getAllStudent
    @GetMapping("/getAll")
    public ResponseEntity<List<Student>> getAllStudent(){
        List<Student> stuGet = studentService.getAllStudent();

        if(stuGet != null) {
            return ResponseEntity
                    .status(200).body(stuGet);
        }

        return ResponseEntity.notFound().build();
    }

    //updateStudent
    @PutMapping("/update/{id}")
    public ResponseEntity<Student> getStudent(@RequestBody Student stuPutReq, @PathVariable Long id){
        Student stuPut = studentService.updateStudent(stuPutReq, id);
        if(stuPut == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(stuPut);
    }

    //deleteStudent
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        Boolean isDeleted = studentService.delStudent(id);

        if(!isDeleted){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.status(HttpStatus.OK).body("record deleted");
    }

    //softDelete

}
