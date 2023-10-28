package com.form.Form.services;

import java.util.List;

import com.form.Form.entity.Student;

public interface StudentService {
   List<Student>getAllStudents();
   Student saveStudent(Student student);
   
   Student getStudentById(Long id);
   Student updateStudent(Student student);
   void deleteStudentById(Long id);
}
