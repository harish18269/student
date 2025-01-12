package com.student.service;

import java.util.List;

import com.student.entity.Student;

public interface StudentService {

	public List<Student> getAllStud();
	
	public Student addStud(Student student);
	
	public Student getById(int id);
	
	public Student updateStud(int id, Student student);
	
	public void deleteById(int id);
}
