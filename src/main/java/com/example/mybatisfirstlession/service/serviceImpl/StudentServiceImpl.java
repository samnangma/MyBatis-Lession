package com.example.mybatisfirstlession.service.serviceImpl;

import com.example.mybatisfirstlession.model.Student;
import com.example.mybatisfirstlession.repository.StudentRepository;
import com.example.mybatisfirstlession.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    StudentRepository studentRepository;
//    Constructor Injection
//    StudentServiceImpl(StudentRepository studentRepository){
//        this.studentRepository= studentRepository;
//    }

    @Autowired
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.getAllStudent();
    }

    @Override
    public int addNewStudent(Student student) {
        return studentRepository.addNewStudent(student);
    }

    @Override
    public int editStudent(Student student) {
        return 0;
    }

    @Override
    public int removeStudent(int id) {
        return 0;
    }
}
