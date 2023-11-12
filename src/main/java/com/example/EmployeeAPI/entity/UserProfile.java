package com.example.EmployeeAPI.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "user_profiles")
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String phoneNumber;
    private String address;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private LocalDate birthOfDate;
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private User user;

    public UserProfile() {
    }

    public UserProfile(String phoneNumber, String address, Gender gender, LocalDate birthOfDate) {
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.gender = gender;
        this.birthOfDate = birthOfDate;
    }
}
