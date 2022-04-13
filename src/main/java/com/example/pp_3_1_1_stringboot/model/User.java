package com.example.pp_3_1_1_stringboot.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "usertable")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String lastName;

    @Column
    private int age;
}
