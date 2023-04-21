package com.example.mybatisfirstlession.service;

import com.example.mybatisfirstlession.model.Student;

import java.util.List;

public interface StudentService {
     List<Student> getAllStudents();

    int addNewStudent(Student student);
    int editStudent(Student student);
    int removeStudent(int id);
}
