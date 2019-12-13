package com.hp.student02.service;

import com.hp.student02.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StudentService {
    List<Student> findAll();


    void addStudent(Student student);
}
