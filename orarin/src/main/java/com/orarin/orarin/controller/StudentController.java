package com.orarin.orarin.controller;

import com.orarin.orarin.model.Student;
import com.orarin.orarin.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping(value = "/add")
    public Student addStudent(@RequestBody Student student) {

        return studentService.addStudent(student);
    }

    @GetMapping(value = "/mock")
    public String getMock() {
        return "Mock student";
    }

    @GetMapping(value = "/get/{id}")
    public Student getStudentById(@PathVariable Integer id) {
        return studentService.getStudentById(id);
    }

    @GetMapping(value = "/getall")
    public List<Student> getAllStudents() {
        return studentService.getStudentList();
    }

    @PutMapping(value = "/update/{id}")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable Integer id) {
        studentService.delete(id);
    }
}

