package com.StuMang.REST.API.service;

import com.StuMang.REST.API.entity.Student;
import com.StuMang.REST.API.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public void createStudent(Student stuCreReq){
        // business;
        studentRepository.saveStudent(stuCreReq);
    }
}
