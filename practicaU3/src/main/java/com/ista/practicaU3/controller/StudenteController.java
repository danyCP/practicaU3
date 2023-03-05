package com.ista.practicaU3.controller;

import com.ista.practicaU3.models.Student;
import com.ista.practicaU3.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudenteController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public List <Student> getAllStudents(){
        return studentService.findAll();
    }

    @GetMapping("/{studentNumber}")
    public Student getStudentByStudentNumber(@PathVariable("numEstu") Long studentNumber) {
        return studentService.findByStudenteNumber(studentNumber);
    }

    @GetMapping("/email/{email}")
    public Student findByCorreo(@PathVariable("email") String email) {
        return studentService.findByEmail(email);
    }

    @GetMapping("/gpa")
    public List<Student> findAllByOrderByGpa() {
        return studentService.findAllByOrderByGpa();
    }

    @PostMapping("/")
    public ResponseEntity<String> saveOrUpdateEstudiante(@RequestBody Student student) {
        studentService.saveOrUpdateStudent(student);
        return new ResponseEntity("Estudiante agregado con exito", HttpStatus.OK);
    }

    @DeleteMapping("/{studentNumber}")
    public void deleteStudent (@PathVariable Long studentNumber) {
        studentService.deleteStudent(studentService.findByStudenteNumber(studentNumber).getId());
        new ResponseEntity("Estudiante eliminado exitosamente!", HttpStatus.OK);
    }
}
