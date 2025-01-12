package com.student.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	// to get all the details of the student
	@GetMapping
	public List<Student> getAllStudents() {
		return studentService.getAllStud();
	}

	@GetMapping("/{id}")
	public Student getById(@PathVariable int id) {
		return studentService.getById(id);
	}

	@PostMapping
	public Student addStudent(@RequestBody Student student) {
		return studentService.addStud(student);
	}
	
	// This method is for updating the student details
	@PutMapping("/{id}")
	public Student updateStudent(@PathVariable int id, @RequestBody Student student) {
		return studentService.updateStud(id, student);
	}

	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable int id) {
		return studentService.deleteById(id);
	}
}
