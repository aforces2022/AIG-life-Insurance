package com.zorba.aig.life.insurance.controller;

import com.zorba.aig.life.insurance.entity.Employee;
import com.zorba.aig.life.insurance.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/api/employees")
    public List<Employee> allEmp(){
        return employeeService.getAllEmployee();
    }

    @PostMapping(value = "/api/employee",consumes = "application/json",produces = "application/json")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }


    @PutMapping(value = "/api/employee",consumes = "application/json",produces = "application/json")
    public String update(@RequestBody Employee employee){
        String status="";

        try {
            employeeService.saveEmployee(employee);
            status="sucess";
        }catch (Exception e){
            status="failure";
        }

        return status;
    }

    @GetMapping(value = "/api/employee/{id}")
    public Employee findEmployeeById(@PathVariable("id") int id){
        return employeeService.findEmployeeById(id);
    }

    @DeleteMapping(value = "/api/employee")
    public String deleteEmpById(@RequestParam("id") int id){

        String status ="";

        try {
            employeeService.deleteById(id);
            status="success";
        }catch (Exception e){
            status="failure";
        }
        return status;
    }
}
