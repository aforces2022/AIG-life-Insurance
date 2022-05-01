package com.zorba.aig.life.insurance;

import com.zorba.aig.life.insurance.entity.Employee;
import com.zorba.aig.life.insurance.repository.EmployeeRepository;
import com.zorba.aig.life.insurance.util.A;
import com.zorba.aig.life.insurance.util.EmployeeDemoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class AigLifeInsuranceApplication {


	public static void main(String[] args) {

		//creating ioc container
		ConfigurableApplicationContext context=SpringApplication.run(AigLifeInsuranceApplication.class, args);

		EmployeeRepository repository = context.getBean(EmployeeRepository.class);

		List<Employee> employeeList =repository.findAll();

		System.out.println("select * from emp");
		System.out.println(employeeList);

		System.out.println("select * from emp where id =1");
		Optional<Employee> employeeOptional =repository.findById(1);
		System.err.println(employeeOptional.get());

		System.err.println(repository.count());

		System.out.println("inserting a record into db");

		Employee employee = new Employee();
		employee.setId(3);
		employee.setName("rohit");
		employee.setAddress("mumbai");
		employee.setPhone("83947892347");
		employee.setSal(3894732);
		repository.save(employee);

		System.out.println("data inserted successfully");

		System.out.println("find all the records");
		System.err.println(repository.findAll());

		System.out.println(repository.findEmployeeByName("DHONI"));
		System.out.println(repository.findEmployeeByNameStartingWith("D"));
		/*EmployeeDemoRepo employeeDemoRepo = new EmployeeDemoRepo();
		Optional<Employee> e = employeeDemoRepo.findById(1);
		if(e.isPresent()){
			Employee e1 = e.get();
			System.out.println(e1.getName());
		}*/

	}

}
