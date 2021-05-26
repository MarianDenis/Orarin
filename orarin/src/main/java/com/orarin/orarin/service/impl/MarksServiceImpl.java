package com.orarin.orarin.service.impl;

import com.orarin.orarin.dao.MarksRepository;
import com.orarin.orarin.dao.StudentRepository;
import com.orarin.orarin.model.Marks;
import com.orarin.orarin.model.Student;
import com.orarin.orarin.service.MarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MarksServiceImpl implements MarksService {

    @Autowired
    private MarksRepository marksRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Marks addMarks(Marks marks, Integer id) {

        Optional<Student> student = studentRepository.findById(id);
        marks.setStudent(student.get());
        return marksRepository.save(marks);
    }

    @Override
    public void deleteMarks(Integer id) {

        marksRepository.deleteById(id);
    }
}
