package com.example.demo.dao;

import com.example.demo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Repository
public class StudentDaoImpl implements StudentDao {
    private final HashMap<Integer, Student> studentMap = new HashMap<>();
    private int currentId = 1; // To auto-generate IDs

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(studentMap.values());
    }

    @Override
    public Optional<Student> findById(Integer id) {
        return Optional.ofNullable(studentMap.get(id));
    }

    @Override
    public Student save(Student student) {
        student.setId(currentId++);
        studentMap.put(student.getId(), student);
        return student;
    }

    @Override
    public Student update(Integer id, Student student) {
        if (!studentMap.containsKey(id)) {
            return null; // or throw an exception
        }
        student.setId(id);
        studentMap.put(id, student);
        return student;
    }

    @Override
    public void deleteById(Integer id) {
        studentMap.remove(id);
    }
}
