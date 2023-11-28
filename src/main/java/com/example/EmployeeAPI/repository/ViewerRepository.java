package com.example.EmployeeAPI.repository;

import com.example.EmployeeAPI.entity.Viewer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ViewerRepository extends JpaRepository<Viewer,Long> {
}
