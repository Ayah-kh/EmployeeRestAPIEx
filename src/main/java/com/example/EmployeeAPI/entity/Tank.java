package com.example.EmployeeAPI.entity;

import jakarta.persistence.Entity;

@Entity
public class Tank extends Vehicle {
    private Integer firePower;

    public Tank() {
    }

    public Tank(String name, Integer seats, Integer firePower) {
        super(name, seats);
        this.firePower = firePower;
    }
}
