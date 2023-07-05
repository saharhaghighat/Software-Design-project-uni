package com.alzahra.sd.model;

import com.alzahra.sd.model.enums.SalaryType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="job")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Job {



    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(name = "name",nullable = false )
    private String name;


    @Column(name = "salary_per_hour",nullable = false )
    private Double salaryPerHour;


    @Enumerated(EnumType.STRING)
    @Column(name = "salary_type",columnDefinition = "enum('SALARIED','HOURLY')",nullable = false)
    private SalaryType salaryType;







}
