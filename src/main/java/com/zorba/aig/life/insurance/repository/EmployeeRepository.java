package com.zorba.aig.life.insurance.repository;

import com.zorba.aig.life.insurance.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {


   /* List<Employee> findEmployeeByName(String name);

    List<Employee> findEmployeeByNameStartingWith(String name);*/
}
