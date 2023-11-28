package com.example.EmployeeAPI.entity;

import jakarta.persistence.Entity;

@Entity
public class Trunk extends Vehicle{
    private Integer maxLoad;
    private Boolean sleeperCap;

    public Trunk() {
    }

    public Trunk(String name, Integer seats, Integer maxLoad, Boolean sleeperCap) {
        super(name, seats);
        this.maxLoad = maxLoad;
        this.sleeperCap = sleeperCap;
    }
}
