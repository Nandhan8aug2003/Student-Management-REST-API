package com.StuMang.REST.API.service;

import com.StuMang.REST.API.entity.Student;
import com.StuMang.REST.API.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Student getStudent(Long id){
        Optional<Student> stuGet = studentRepository.findById(id);

        if(stuGet.isEmpty()){
            return null;
        }
        return stuGet.get();
    }

    public List<Student> getAllStudent(){
        List<Student> stuGet = studentRepository.findAll();

        if(stuGet.isEmpty()){
            return null;
        }
        return stuGet;
    }
}
