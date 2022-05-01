package com.zorba.aig.life.insurance.util;

import com.zorba.aig.life.insurance.entity.Employee;

import java.util.Optional;

public class EmployeeDemoRepo {

    public Optional<Employee> findById(int id){
        Optional<Employee> employeeOptional = Optional.empty();
        if(id ==1){
            Employee employee = new Employee();
            employee = new Employee();
            employee.setId(id);
            employee.setName("dhoni");
            employee.setSal(487632);
            employee.setAddress("ranchi");
            employee.setPhone("7834243");
            employeeOptional = Optional.of(employee);

        }
        return employeeOptional;
    }
}
