package com.example.EmployeeAPI.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "stream")
public class MyStream {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private List<Viewer> followers = new ArrayList<>();

    public MyStream() {
    }

    public MyStream(String name) {
        this.name = name;
    }

    public void addViewer(Viewer viewer) {
        followers.add(viewer);
    }
}
