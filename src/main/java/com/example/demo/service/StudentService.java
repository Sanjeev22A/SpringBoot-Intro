package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(Integer id);
    Student createStudent(Student student);
    Student updateStudent(Integer id, Student student);
    void deleteStudent(Integer id);
}
