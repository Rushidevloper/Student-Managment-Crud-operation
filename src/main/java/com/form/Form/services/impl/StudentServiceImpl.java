package com.form.Form.services.impl;


import java.util.List;

import org.springframework.stereotype.Service;

import com.form.Form.entity.Student;
import com.form.Form.repository.StudentRepository;
import com.form.Form.services.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;
	
	StudentServiceImpl(StudentRepository studentRepository){
		super();
		this.studentRepository=studentRepository;
	}
	@Override
	public List<Student> getAllStudents() {
		
		return this.studentRepository.findAll();
	}
	
	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}
	@Override
	public Student getStudentById(Long id) {
		
		return studentRepository.findById(id).get();
	}
	@Override
	public Student updateStudent(Student student) {
		
		return studentRepository.save(student);
	}
	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
		
	}

}
