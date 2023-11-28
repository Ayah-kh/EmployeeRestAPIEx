package com.example.EmployeeAPI.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer seats;

    public Vehicle() {
    }

    public Vehicle(String name, Integer seats) {
        this.name = name;
        this.seats = seats;
    }
}
