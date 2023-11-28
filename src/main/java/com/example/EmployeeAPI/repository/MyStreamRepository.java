package com.example.EmployeeAPI.repository;

import com.example.EmployeeAPI.entity.MyStream;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyStreamRepository extends JpaRepository<MyStream,Long> {
}
