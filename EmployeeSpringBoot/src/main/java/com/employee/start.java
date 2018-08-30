package com.employee;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.employee.pojo.Employee;
import com.employee.service.employeeServiceImpl;

@SpringBootApplication
public class start {
	private static org.jboss.logging.Logger logger = LoggerFactory.logger(start.class);
	public static void main(String[] args) {
		SpringApplication.run(start.class, args);
		logger.fatal("A fatal message");
		logger.debug("A debug message");
		logger.info("An info message");
		logger.warn("A warning message");
		logger.error("An error message");
	}
	
	@Bean
	public CommandLineRunner loadInitialData(employeeServiceImpl service) {
		return (args)->{
			service.addEmployee(new Employee(100,"Pavithra",34000));
			service.addEmployee(new Employee(101,"Dennis",90000));
			service.addEmployee(new Employee(102,"Catherine",23000));
			service.addEmployee(new Employee(103,"Rima",60000));
			service.addEmployee(new Employee(104,"Ken",80000));
			service.addEmployee(new Employee(105,"Hiedi",50000));
			
		};
		
	}
}
