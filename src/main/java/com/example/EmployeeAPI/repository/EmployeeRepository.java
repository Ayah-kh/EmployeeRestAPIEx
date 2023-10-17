package com.example.EmployeeAPI.repository;

import com.example.EmployeeAPI.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
