package com.demo.csv.upload.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.demo.csv.upload.entities.Student;
import com.demo.csv.upload.service.UploadService;

/**
 * 
 * Student data upload by using CSV file
 * 
 * @author Mohamed Ashfaq
 *
 * @Created 19-Dec-2020
 * Can use students.csv file for testing which is available within the project files. 
 *
 */
@RestController
@RequestMapping("/students")
public class UploadController {

	@Autowired
	private UploadService uploadService;

	@Autowired
	UploadController(UploadService uploadService) {
		this.uploadService = uploadService;
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public List<Student> uploadFile(@RequestPart(value = "file") MultipartFile multiPartFile) throws IOException {
		return uploadService.uploadFile(multiPartFile);
	}
	
	@RequestMapping
	public List<Student> getStudents(){
		return uploadService.getStudents();
	}
}