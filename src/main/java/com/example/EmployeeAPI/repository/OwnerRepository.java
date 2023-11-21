package com.example.EmployeeAPI.repository;

import com.example.EmployeeAPI.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner,Long> {
}
