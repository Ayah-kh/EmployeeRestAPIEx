package com.example.EmployeeAPI.repository;

import com.example.EmployeeAPI.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
