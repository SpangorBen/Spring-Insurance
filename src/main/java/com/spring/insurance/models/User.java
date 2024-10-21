package com.spring.insurance.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    private String address;
    private String email;
    private String phone;
    private LocalDate birthDate;

    public User() {
    }

    public User(String name, String address, String email, String phone, LocalDate birthDate) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.birthDate = birthDate;
    }


}
