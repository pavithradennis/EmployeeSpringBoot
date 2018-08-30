package com.employee.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.pojo.Employee;
@Repository
public interface employeeDaoInterface extends JpaRepository<Employee,Integer>{

	
}