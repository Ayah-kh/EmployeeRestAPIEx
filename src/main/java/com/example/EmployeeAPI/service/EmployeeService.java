package com.example.EmployeeAPI.service;

import com.example.EmployeeAPI.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee (Employee employee);
    List<Employee> getAllEmployee ();

    Employee getEmployeeById(long id);
}
