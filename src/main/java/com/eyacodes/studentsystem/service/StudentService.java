package com.eyacodes.studentsystem.service;

import java.util.List;

import com.eyacodes.studentsystem.model.Student;



public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
