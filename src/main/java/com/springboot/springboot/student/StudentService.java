package com.springboot.springboot.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public List<Student> getStudent() {
        List<Student> studentsList = studentRepository.findAll();
        return studentsList;


    }
}