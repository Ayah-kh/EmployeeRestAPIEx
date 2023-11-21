package com.example.EmployeeAPI.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String model;
    @OneToOne(mappedBy = "car")//the field which owns the relationship
    private Owner owner;

    public Car() {
    }

    public Car(String model) {
        this.model = model;
    }
}
