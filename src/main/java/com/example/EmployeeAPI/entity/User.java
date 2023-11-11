package com.example.EmployeeAPI.entity;

import lombok.Data;

@Data
public class User {
    private long id;
    private String name;
    private String email;

    public User() {
    }

    public User(String name, String email, UserProfile userProfile) {
        this.name = name;
        this.email = email;
        this.userProfile = userProfile;
    }

    private UserProfile userProfile;

}
