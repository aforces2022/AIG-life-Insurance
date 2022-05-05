package com.zorba.aig.life.insurance.controller;

import com.zorba.aig.life.insurance.entity.Employee;
import com.zorba.aig.life.insurance.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    //localhost:8080/api/employee
    @GetMapping("/api/employee")
    public List<Employee> allEmp(){
        return employeeService.getAllEmployee();
    }
}
