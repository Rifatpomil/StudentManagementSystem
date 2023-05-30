package com.Rifatpomil.projectsystem.service;

import com.Rifatpomil.projectsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}

