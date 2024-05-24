package com.hibernatespringboot.hibernate.controllers;

import com.hibernatespringboot.hibernate.entinties.Student;
import com.hibernatespringboot.hibernate.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//so che alcune cose non erano necessarie ai fini dell'esercizio ma le ho messe per abituarmi a tutta l'impostazione

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        studentService.createStudent(student);
        return ResponseEntity.ok().body(student);
    }
    @GetMapping("/list")
    public ResponseEntity<List<Student>> getAllStudent() {
        List<Student> studentList = studentService.getAllStudent();
        return ResponseEntity.ok().body(studentList);
    }
}
