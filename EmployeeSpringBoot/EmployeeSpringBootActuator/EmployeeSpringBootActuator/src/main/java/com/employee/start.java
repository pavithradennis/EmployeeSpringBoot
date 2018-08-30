package com.employee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.employee.pojo.Employee;
import com.employee.service.employeeServiceImpl;

@SpringBootApplication
public class start {
	public static void main(String[] args) {
		SpringApplication.run(start.class, args);
	}
	
	@Bean
	public CommandLineRunner loadInitialData(employeeServiceImpl service) {
		return (args)->{
			service.addEmployee(new Employee(100,"Siri",30000));
			service.addEmployee(new Employee(101,"Prabha",10000));
			service.addEmployee(new Employee(102,"Ruth",20000));
			service.addEmployee(new Employee(103,"Mahima",40000));
			service.addEmployee(new Employee(104,"suma",60000));
			service.addEmployee(new Employee(105,"swati",90000));
			
		};
		
	}
}
