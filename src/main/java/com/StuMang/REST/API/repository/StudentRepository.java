package com.StuMang.REST.API.repository;

import com.StuMang.REST.API.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentRepository {
    public Student saveStudent(Student stuCreReq){
        System.out.println("inside controller");
        return stuCreReq;
    }
}
