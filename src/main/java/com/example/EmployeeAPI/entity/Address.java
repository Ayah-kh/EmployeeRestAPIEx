package com.example.EmployeeAPI.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String street;

    public Address() {
    }

    public Address(String street) {
        this.street = street;
    }
}
