package com.ista.practicaU3.service;

import com.ista.practicaU3.models.Student;

import java.util.List;

public interface StudentService {

    List <Student> findAll();

    Student findByStudenteNumber (Long studenteNumber);

    Student findByEmail(String email);

    List<Student> findAllByOrderByGpa();

    void saveOrUpdateStudent (Student student);

    void deleteStudent (String id);
}
