package com.example.EmployeeAPI.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Owner")
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToOne(mappedBy = "car")//the field which owns the relationship
    private Car car;
}
