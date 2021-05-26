package com.orarin.orarin.service;

import com.orarin.orarin.model.Student;

import java.util.List;

public interface StudentService {
    Student addStudent(Student student);

    Student getStudentById(Integer id);

    List<Student> getStudentList();

    Student updateStudent(Student student);

    void delete(Integer id);

}
