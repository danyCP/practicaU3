package com.ista.practicaU3.service;

import com.ista.practicaU3.models.Student;
import com.ista.practicaU3.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;


    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findByStudenteNumber(Long studenteNumber) {
        return studentRepository.findByStudentNumber(studenteNumber);
    }

    @Override
    public Student findByEmail(String email) {
        return studentRepository.findByEmail(email);
    }

    @Override
    public List<Student> findAllByOrderByGpa() {
        return studentRepository.findAllByOrderByGpa();
    }

    @Override
    public void saveOrUpdateStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void deleteStudent(String id) {
        studentRepository.deleteById(id);
    }
}
