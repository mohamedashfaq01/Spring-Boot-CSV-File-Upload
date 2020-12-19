package com.demo.csv.upload.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.csv.upload.entities.Student;
import com.demo.csv.upload.repository.StudentRepository;

@Repository
public class StudentDAO {

	@Autowired
	private StudentRepository studentRepository;

	public void batchStore(List<Student> studentList) {
		studentRepository.saveAll(studentList);
	}

	public List<Student> getStudents() {
		return studentRepository.findAll();
	}

}
