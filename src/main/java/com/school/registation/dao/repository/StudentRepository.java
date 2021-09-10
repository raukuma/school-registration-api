package com.school.registation.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.registation.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
