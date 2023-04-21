package com.example.mybatisfirstlession.controller;

import com.example.mybatisfirstlession.model.Student;
import com.example.mybatisfirstlession.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    StudentService studentService;
    StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/allstudents")
    List<Student> getallStudent(){
        Student newStudent = new Student(4,"Nana","Female","Data",80);
        int result = studentService.addNewStudent(newStudent);

        System.out.println("Inserted Row : " + result);
        return studentService.getAllStudents();
    }



}
