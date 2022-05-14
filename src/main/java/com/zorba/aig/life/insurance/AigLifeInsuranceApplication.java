package com.zorba.aig.life.insurance;

import com.zorba.aig.life.insurance.controller.EmployeeController;
import com.zorba.aig.life.insurance.entity.Employee;
import com.zorba.aig.life.insurance.repository.EmpRep;
import com.zorba.aig.life.insurance.repository.EmployeeRepository;
import com.zorba.aig.life.insurance.service.ProfTestUtil;
import com.zorba.aig.life.insurance.util.*;
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

		EmployeeController controller = context.getBean(EmployeeController.class);
		System.out.println(controller.allEmp());

		/*AdvancedCalculator advancedCalculator = context.getBean(AdvancedCalculator.class);
		AdvancedCalculator advancedCalculator1 = context.getBean(AdvancedCalculator.class);

		System.out.println(advancedCalculator.hashCode());
		System.out.println(advancedCalculator1.hashCode());

		System.out.println(advancedCalculator.qubesum(10,12));

		ScintificCalculator calculator = context.getBean(ScintificCalculator.class);
		System.out.println(calculator.squareSum(10,6));

		BinaryCalculator calculator1 = context.getBean(BinaryCalculator.class);
		calculator1.printValue(98,43);
*/


		/*EmployeeRepository repository = context.getBean(EmployeeRepository.class);

		//select * from emp;
		List<Employee> employees = repository.findAll();

		System.out.println(employees);

		Employee employee = repository.findById(1).get();
		employee.setName("MS DHONI");

		repository.save(employee);


		System.out.println("updated data");
		System.out.println(repository.findAll());

		System.out.println("number of record in the database");
		//select count(*) from emp;

		long records = repository.count();

		System.out.println(records);

		//insert into emp (id,name,address,sal) values(3,'rohit','bom',67);
		Employee employee1 = new Employee();
		employee1.setId(3);
		employee1.setName("rohit");
		employee1.setAddress("mumbai");
		employee1.setPhone("3424234");
		employee1.setSal(8746334);

		repository.save(employee1);

		System.out.println(repository.findAll());

		repository.deleteById(1);

		System.out.println(repository.findAll());*/










		/*List<Employee> employeeList =repository.findAll();

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
		System.out.println(repository.findEmployeeByNameStartingWith("D"));*/
		/*EmployeeDemoRepo employeeDemoRepo = new EmployeeDemoRepo();
		Optional<Employee> e = employeeDemoRepo.findById(1);
		if(e.isPresent()){
			Employee e1 = e.get();
			System.out.println(e1.getName());
		}*/

		ProfTestUtil profTestUtil = context.getBean(ProfTestUtil.class);
		profTestUtil.print();


	}

}
