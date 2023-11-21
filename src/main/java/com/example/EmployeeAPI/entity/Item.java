package com.example.EmployeeAPI.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String serialNumber;
    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    public Item() {
    }

    public Item(String serialNumber, Cart cart) {
        this.serialNumber = serialNumber;
        this.cart = cart;
    }
}
