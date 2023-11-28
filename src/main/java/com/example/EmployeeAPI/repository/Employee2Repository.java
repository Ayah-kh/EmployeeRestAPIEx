package com.example.EmployeeAPI.repository;

import com.example.EmployeeAPI.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Employee2Repository extends JpaRepository<Employee,Integer> {
}
