package com.example.EmployeeAPI.repository;

import com.example.EmployeeAPI.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepository extends JpaRepository<UserProfile,Long> {
}
