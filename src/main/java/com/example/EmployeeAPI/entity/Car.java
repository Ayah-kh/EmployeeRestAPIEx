package com.example.EmployeeAPI.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String model;
    @OneToOne
    @JoinColumn(name = "car_id",referencedColumnName = "id") //on the owning side
    private Owner owner;
}
