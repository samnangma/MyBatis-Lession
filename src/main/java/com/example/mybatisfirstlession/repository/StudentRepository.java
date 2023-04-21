package com.example.mybatisfirstlession.repository;

import com.example.mybatisfirstlession.model.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentRepository {

    @Select("select * from student_tb")
    List <Student> getAllStudent();

    @Insert ("insert into student_tb (id, name, gender, classroom, score)\n" +
   " values (#{student.id},#{student.name},#{student.gender},#{student.classroom},#{student.score});")

    int addNewStudent(@Param("student") Student student);
}
