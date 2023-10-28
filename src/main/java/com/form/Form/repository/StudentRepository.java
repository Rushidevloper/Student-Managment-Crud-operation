package com.form.Form.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.form.Form.entity.*;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
