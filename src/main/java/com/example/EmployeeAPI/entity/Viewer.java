package com.example.EmployeeAPI.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table
public class Viewer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nickName;
    @ManyToMany
    @JoinTable(
            name = "followed_stream",
           joinColumns = @JoinColumn(name = "viewer_id"),
            inverseJoinColumns = @JoinColumn(name = "stream_id")
    )
    private List<MyStream> followedStreams = new ArrayList<>();

    public Viewer() {
    }

    public Viewer(String nickName) {
        this.nickName = nickName;
    }

    public void followStream (MyStream myStream){
        followedStreams.add(myStream);
    }
}
