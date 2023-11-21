package com.example.EmployeeAPI.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user2")
public class User2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToOne
    @JoinColumn(name = "address",referencedColumnName = "id")
    private Address address;

    public User2() {
    }

    public User2(String name, Address address) {
        this.name = name;
        this.address = address;
    }
}
