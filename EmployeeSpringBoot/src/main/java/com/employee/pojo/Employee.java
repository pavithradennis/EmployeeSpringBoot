package com.employee.pojo;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

//@Entity
public class Employee {

	@Id
    private ObjectId _Id;
	//@Id
	private int empId;
	private String empName;
	private int salary;

	public Employee(int empId, String empName, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public Employee() {
		super();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}