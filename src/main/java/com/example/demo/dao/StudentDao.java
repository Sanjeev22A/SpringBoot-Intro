package com.example.demo.dao;

import com.example.demo.model.Student;
import java.util.List;
import java.util.Optional;

public interface StudentDao {
    List<Student> findAll(); // Retrieve all students
    Optional<Student> findById(Integer id); // Retrieve student by ID
    Student save(Student student); // Add a new student
    Student update(Integer id, Student student); // Update an existing student
    void deleteById(Integer id); // Delete a student by ID
}
