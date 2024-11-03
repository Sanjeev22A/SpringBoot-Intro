package com.example.demo.service;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> getAllStudents() {
        return studentDao.findAll();
    }

    @Override
    public Student getStudentById(Integer id) {
        return studentDao.findById(id).orElse(null);
    }

    @Override
    public Student createStudent(Student student) {
        return studentDao.save(student);
    }

    @Override
    public Student updateStudent(Integer id, Student student) {
        return studentDao.update(id, student);
    }

    @Override
    public void deleteStudent(Integer id) {
        studentDao.deleteById(id);
    }
}
