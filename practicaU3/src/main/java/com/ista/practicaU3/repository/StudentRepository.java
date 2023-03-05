package com.ista.practicaU3.repository;

import com.ista.practicaU3.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;

public interface StudentRepository extends MongoRepository <Student, String> {

    Student findByStudentNumber(Long studentNumber);

    Student findByEmail(String email);

    List<Student> findAllByOrderByGpa();
}
