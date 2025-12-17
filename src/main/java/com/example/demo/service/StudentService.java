package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Student;

public interface StudentService { //abstract method can be only in interface

//abstract
    Student createData(Student stu);
    List<Student> fetchRecord();

}
