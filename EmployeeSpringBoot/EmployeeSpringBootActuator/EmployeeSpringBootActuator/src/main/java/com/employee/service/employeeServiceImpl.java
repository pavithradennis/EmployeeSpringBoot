package com.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.employeeDaoInterface;
import com.employee.pojo.Employee;

@Service
public class employeeServiceImpl implements employeeServiceInterface {

	@Autowired
	private employeeDaoInterface dao;

	@Override
	public List<Employee> getAllEmployees() {

		return dao.findAll();
	}

	@Override
	public Optional<Employee> getEmployee(int id) {

		return dao.findById(id);
	}

	@Override
	public void addEmployee(Employee employee) {
		dao.save(employee);
	}

	@Override
	public void updateEmployee(Employee emp, int id) {
		dao.save(emp);
	}

	@Override
	public void deleteEmployee(int id) {
		dao.deleteById(id);

	}

}
