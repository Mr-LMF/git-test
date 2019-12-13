package com.hp.student02.controller;

import com.hp.student02.domain.Student;
import com.hp.student02.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/test")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/findAll")
    @ResponseBody
    public List<Student> findAll(){
        List<Student> list = studentService.findAll();
        return list;
    }
    /*@PostMapping("/add")
    @ResponseBody
    public Student add(*//*@RequestParam(name = "name") String name,
            @RequestParam(name = "pass") String pass*//*
            Student student
                    ){

       *//* Student student = new Student();
        student.setName(name);
        student.setPass(pass);
        student.setReTime(new Date());
        System.out.println(student.getName());
        System.out.println(student.getPass());*//*

        return studentService.addStudent(student);
    }*/

    @PostMapping("/add1")
    @ResponseBody
    public void add1(@RequestParam(name = "name") String name, @RequestParam(name = "pass") String pass){
       Student student = new Student();
        student.setName(name);
        student.setPass(pass);
        student.setReTime(new Date());

        System.out.println("231312312");
        System.out.println("231312312");
        System.out.println("231312312");
        System.out.println("231312312");
        System.out.println("231312312");
        studentService.addStudent(student);
    }
}
