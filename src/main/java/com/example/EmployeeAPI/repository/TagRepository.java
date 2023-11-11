package com.example.EmployeeAPI.repository;

import com.example.EmployeeAPI.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag,Long> {
}
