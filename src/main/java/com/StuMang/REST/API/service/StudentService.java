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

    public Student createStudent(Student stuCreReq){
        Student stuRet = studentRepository.save(stuCreReq);
        return stuRet;
    }
}
