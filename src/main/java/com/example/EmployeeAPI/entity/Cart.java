package com.example.EmployeeAPI.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    @OneToMany(mappedBy = "cart" //point to the field that owns the relationship
            , cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<Item> items = new ArrayList<>();

    public Cart() {
    }

    public Cart(String name) {
        this.name = name;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
