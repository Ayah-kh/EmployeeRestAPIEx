package com.example.EmployeeAPI.repository;

import com.example.EmployeeAPI.entity.University;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversityRepository extends JpaRepository<University,Long> {
}
