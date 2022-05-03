package com.zorba.aig.life.insurance.service;


import com.zorba.aig.life.insurance.entity.Employee;
import com.zorba.aig.life.insurance.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public List<Employee> getAllEmployee(){
        List<Employee> employees =repository.findAll();
        return employees;
    }
}
