package com.zorba.aig.life.insurance.controller;

import com.zorba.aig.life.insurance.entity.Employee;
import com.zorba.aig.life.insurance.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> allEmp(){
        return employeeService.getAllEmployee();
    }

    @PostMapping(value = "/employee",consumes = "application/json",produces = "application/json")
    public Employee addEmployee(@RequestBody @Valid Employee employee){
        return employeeService.saveEmployee(employee);
    }


    @PutMapping(value = "/employee",consumes = "application/json",produces = "application/json")
    public String update(@RequestBody Employee employee){
        String status=null;

        status.length();
        try {
            employeeService.saveEmployee(employee);

            status="sucess";
        }catch (Exception e){
            status="failure";
        }

        return status;
    }

    @GetMapping(value = "/employee/{id}")
    public Employee findEmployeeById(@PathVariable("id") int id){
        return employeeService.findEmployeeById(id);
    }

    @DeleteMapping(value = "/employee")
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
