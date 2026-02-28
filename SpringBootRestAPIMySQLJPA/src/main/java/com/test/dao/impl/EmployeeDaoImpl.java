package com.test.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.dao.EmployeeDao;
import com.test.entity.Employee;
import com.test.exceptions.EmployeeNotFoundException;
import com.test.repository.EmployeeRepository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	
	@Autowired
	private EmployeeRepository repository;
	
	@Override
	public Employee saveEmployee(Employee emp) {
		return repository.save(emp);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		return repository.save(emp);
	}

	@Override
	public Optional<Employee> getEmployeeById(int id) {
		
		return Optional.ofNullable(repository.findById(id).orElseThrow(() -> new EmployeeNotFoundException("Employee with id not found")));
	}

	@Override
	public List<Employee> deleteEmployeeById(int id) {
		repository.deleteById(id);
		return repository.findAll();
	}

	@Override
	public List<Employee> getAllEmployees() {
		return repository.findAll();
	}

}
