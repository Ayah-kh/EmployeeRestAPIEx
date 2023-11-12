package com.example.EmployeeAPI.repository;

import com.example.EmployeeAPI.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
