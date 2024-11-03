package com.example.demo.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class Student {

    private Integer id; // No @Id annotation

    @NotEmpty(message = "Name should not be empty")
    private String name;

    @NotNull(message = "Age is required")
    @Min(value = 1, message = "Age should be a positive integer")
    private Integer age;

    @NotEmpty(message = "Course should not be empty")
    private String course;

    @NotNull(message = "Marks are required")
    @Min(value = 0, message = "Marks should be non-negative")
    private Double marks;

    private Boolean feesPaid;

    // Default constructor
    public Student() {}

    // Parameterized constructor
    public Student(Integer id, String name, Integer age, String course, Double marks, Boolean feesPaid) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
        this.feesPaid = feesPaid;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Double getMarks() {
        return marks;
    }

    public void setMarks(Double marks) {
        this.marks = marks;
    }

    public Boolean getFeesPaid() {
        return feesPaid;
    }

    public void setFeesPaid(Boolean feesPaid) {
        this.feesPaid = feesPaid;
    }
}
