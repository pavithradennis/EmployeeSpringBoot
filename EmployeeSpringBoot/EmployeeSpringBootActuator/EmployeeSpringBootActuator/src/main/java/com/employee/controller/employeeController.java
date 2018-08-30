package com.employee.controller;
import org.springframework.hateoas.Resources;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.web.Link;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employee.pojo.Employee;
import com.employee.service.employeeServiceInterface;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
public class employeeController {

	@Autowired
	private employeeServiceInterface service;

	@RequestMapping("/employee")
	public List<Employee> getallEmployees() {
		return service.getAllEmployees();
	}

	@RequestMapping("/employee/{id}")
	public Optional<Employee> getEmployee(@PathVariable int id) {
		return service.getEmployee(id);
	}

	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public void addEmployee(@RequestBody Employee emp) {
		service.addEmployee(emp);
	}

	@RequestMapping(value = "/employee/{id}", method = RequestMethod.PUT)
	public void updateEmployee(@RequestBody Employee emp, @PathVariable int id) {
		service.updateEmployee(emp, id);
	}

	@RequestMapping(value = "/employee/{id}", method = RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable int id) {
		service.deleteEmployee(id);
	}

@RequestMapping("/employee/{start}/{count}")
	public Resources getEmployeeByPage(@PathVariable("start") int start, @PathVariable("count") int count) {
	List<Employee> tempemployee = service.getAllEmployees();
	List<Employee> employee = new ArrayList<>();

		for (int i = start; i < (start + count); i++) {
		employee.add(tempemployee.get(i));
	}
	org.springframework.hateoas.Link nextLink = linkTo(methodOn(this.getClass()).getEmployeeByPage(start+count, count)).withRel("nextLink");
	org.springframework.hateoas.Link previousLink = linkTo(methodOn(this.getClass()).getEmployeeByPage(start - count >=0?start-count:1, count))
			.withRel("previousLink");
	return new Resources(employee,nextLink,previousLink);

	}

}
