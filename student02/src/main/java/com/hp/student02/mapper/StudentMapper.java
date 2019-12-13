package com.hp.student02.mapper;

import com.hp.student02.domain.Student;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface StudentMapper {
    List<Student> findAll();


    void addStudent(Student student);

}
