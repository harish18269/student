package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.exceptions.StudentNotFoundException;
import com.student.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStud() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student addStud(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id)
				.orElseThrow(() -> new StudentNotFoundException("Student with id " + id + " not found."));
	}

	@Override
	public Student updateStud(int id, Student student) {
		// TODO Auto-generated method stub
		Optional<Student> byId = studentRepository.findById(id);

		if (byId.isEmpty()) {
			throw new StudentNotFoundException("Student with id " + id + " not found.");
		}

		Student stud = byId.get();

		student.setId(stud.getId());

		if (student.getName() == null) {
			student.setName(stud.getName());
		}

		if (student.getAge() == 0) {
			student.setAge(stud.getAge());
		}

		if (student.getStudGroup() == null) {
			student.setStudGroup(stud.getStudGroup());
		}
		return studentRepository.save(student);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub

		studentRepository.deleteById(id);
//		return "Deleted successfully.";
	}

}
