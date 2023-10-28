package com.form.Form;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.form.Form.entity.Student;
import com.form.Form.repository.StudentRepository;

@SpringBootApplication
public class FormApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(FormApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {

	}

}
