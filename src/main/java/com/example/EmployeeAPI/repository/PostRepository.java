package com.example.EmployeeAPI.repository;

import com.example.EmployeeAPI.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
