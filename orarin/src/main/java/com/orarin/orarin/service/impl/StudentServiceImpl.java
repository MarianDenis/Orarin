package com.orarin.orarin.service.impl;

import com.orarin.orarin.dao.StudentRepository;
import com.orarin.orarin.model.Student;
import com.orarin.orarin.service.StudentService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Integer id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public List<Student> getStudentList() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public Student updateStudent(Student student) {
		/*Student studentFromDB = studentRepository.findOne(student.getId());
		studentFromDB.setContact(student.);*/

        return studentRepository.save(student);
    }

    @Override
    public void delete(Integer id) {
        studentRepository.deleteById(id);
    }

}
