package com.example.demo.entities;

import org.springframework.data.annotation.Id;


public class User {

    @Id
    private String id;
    private String firstName;
    private String lastName;

    public User () {}

    public User (String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
