package com.employee.service;

import java.util.List;
import java.util.Optional;

import com.employee.pojo.Employee;

public interface employeeServiceInterface {

	public List<Employee> getAllEmployees();

	public Optional<Employee> getEmployee(int id);

	public void addEmployee(Employee emp);

	public void updateEmployee(Employee emp, int id);

	public void deleteEmployee(int id);

}