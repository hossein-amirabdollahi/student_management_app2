package com.school.studentmanagement2.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id")
    private Long id;

    @Column(name = "student_name")
    private String name;

    @Column(name = "student_address")
    private String address;

    @Column(name = "student_phone")
    private String phone;

}
