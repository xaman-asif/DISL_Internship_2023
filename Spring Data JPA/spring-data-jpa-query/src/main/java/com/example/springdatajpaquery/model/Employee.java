package com.example.springdatajpaquery.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

//    @Column(name = "firstname")
    private String firstName;

//    @Column(name = "lastname")
    private String lastName;

//    @Column(name = "department")
    private String department;
}
