package com.StuMang.REST.API.repository;

import com.StuMang.REST.API.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface StudentRepository extends JpaRepository<Student,Long> {
}
