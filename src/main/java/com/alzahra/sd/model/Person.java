package com.alzahra.sd.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Entity
@Table(name="person")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Person {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    private Long personalID;



    @Column(name = "name",nullable = false )
    private String name;


    @Column(name = "last_name",nullable = false )
    private String lastName;

    @Column(name = "national_code",nullable = false )
    private String nationalCode;

    @Column(name = "birth_date",nullable = false )
    private Date birthDate;

    @Column(name = "birth_place",nullable = false )
    private String birthPlace;

    @Column(name = "father_name",nullable = false )
    private String fatherName;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "account_id")
    private Account account;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "job_id")
    private Job job;






}
