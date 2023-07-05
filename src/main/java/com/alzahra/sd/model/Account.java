package com.alzahra.sd.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="account")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(name = "user_name",nullable = false )
    private String userName;


    @Column(name = "password",nullable = false ,length = 30)
    private String password;



}
