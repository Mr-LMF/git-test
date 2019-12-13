package com.hp.student02.service.imp;

import com.hp.student02.domain.Student;
import com.hp.student02.mapper.StudentMapper;
import com.hp.student02.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class StudentServiceImp implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> findAll() {

        return studentMapper.findAll();
    }

    @Override
    public void addStudent(Student student) {

        studentMapper.addStudent(student);
    }
}
