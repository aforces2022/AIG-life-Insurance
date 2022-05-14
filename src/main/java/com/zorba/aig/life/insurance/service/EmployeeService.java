package com.zorba.aig.life.insurance.service;


import com.zorba.aig.life.insurance.entity.Employee;
import com.zorba.aig.life.insurance.repository.EmpRep;
import com.zorba.aig.life.insurance.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Autowired
    @Qualifier("repo1")
    private EmpRep empRepo;

    public List<Employee> getAllEmployee(){
        List<Employee> employees =repository.findAll();
        return employees;
    }


    public Employee findEmployeeById(int id){
        Employee employee =null;
        Optional<Employee> employeeOptional = repository.findById(id);
        if(employeeOptional.isPresent()){
            employee = employeeOptional.get();
        }else{
            employee = new Employee();
        }
        return employee;
    }

    public Employee saveEmployee(Employee employee){
        return repository.save(employee);
    }

    public void deleteById(int id){
        repository.deleteById(id);
    }



}
