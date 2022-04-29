package com.zorba.aig.life.insurance.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
@Setter
@Getter
@ToString
public class Employee {

    @Id
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name ="address")
    private String address;

    @Column(name = "phonenumber")
    private String phone;

    @Column(name = "salary")
    private double sal;

}
