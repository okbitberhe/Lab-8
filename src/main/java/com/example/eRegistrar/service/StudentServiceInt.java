package com.example.eRegistrar.service;

import com.example.eRegistrar.model.Student;

import java.util.Optional;


public interface StudentServiceInt {
    Iterable<Student> getAllStudents();
    Student save(Student s);
    Student findStudentById(Long id);
    void deleteStudent(Student id);
    Optional<Student> findStudentByStudentNumber(String num);
}
