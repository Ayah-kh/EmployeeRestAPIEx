package com.example.EmployeeAPI.repository;

import com.example.EmployeeAPI.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
