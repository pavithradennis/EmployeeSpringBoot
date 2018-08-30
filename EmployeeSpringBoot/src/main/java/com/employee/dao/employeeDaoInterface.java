package com.employee.dao;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.employee.pojo.Employee;
@Repository
public interface employeeDaoInterface extends MongoRepository<Employee,ObjectId>{

Optional<Employee> findByEmpId(int empId);

}