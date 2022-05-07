package com.zorba.aig.life.insurance.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "employee")
@Setter
@Getter
@ToString
public class Employee {

    @Id
    //@NotNull(message = "id can not be null")
    private int id;

    //@NotNull(message = "name can not be null")
    //@NotEmpty(message = "name can not be empty")
    @Column(name = "name")
    private String name;

    //@NotNull(message = "address can not be null")
    //@NotBlank(message = "address can not be empty")
    @Column(name ="address")
    private String address;

    //@Size(min = 10, max = 10, message = "length should be 10 char")
    @Column(name = "phonenumber")
    private String phone;

    //@NotNull(message = "salary should not be null")
    @Column(name = "salary")
    private double sal;

}
