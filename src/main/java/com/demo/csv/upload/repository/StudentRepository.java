package com.demo.csv.upload.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.csv.upload.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
