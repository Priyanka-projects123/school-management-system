package com.radharaman.schoolmanagementsystem.service;

import com.radharaman.schoolmanagementsystem.entity.Student;
import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student addStudent(Student student);
    Student getStudentById(int id);
    void deleteStudent(int id);
}