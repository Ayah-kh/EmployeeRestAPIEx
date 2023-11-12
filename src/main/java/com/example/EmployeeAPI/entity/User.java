package com.example.EmployeeAPI.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "user")
//    @JoinColumn(name = "up_id")
    private UserProfile userProfile;

    public User() {
    }

    public User(String name, String email, UserProfile userProfile) {
        this.name = name;
        this.email = email;
        this.userProfile = userProfile;
    }



}
