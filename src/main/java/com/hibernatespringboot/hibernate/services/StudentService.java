package com.hibernatespringboot.hibernate.services;

import com.hibernatespringboot.hibernate.dao.StudentDAO;
import com.hibernatespringboot.hibernate.entinties.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentDAO studentDAO;

    public Student createStudent(Student student){
        studentDAO.save(student);
        return student;
    }
    public List<Student> getAllStudent(){
        return studentDAO.findAll();
    }
}
