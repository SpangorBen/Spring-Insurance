package com.spring.insurance.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    private String address;
    private String phone;

    @Column(nullable = false)
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
