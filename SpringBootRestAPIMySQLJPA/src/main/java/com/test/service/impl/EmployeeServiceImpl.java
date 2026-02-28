package com.test.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.EmployeeDao;
import com.test.entity.Employee;
import com.test.exceptions.EmployeeNotFoundException;
import com.test.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public Employee saveEmployee(Employee emp) {
		return employeeDao.saveEmployee(emp);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		return employeeDao.updateEmployee(emp);
	}

	@Override
	public Optional<Employee> getEmployeeById(int id) {
		return employeeDao.getEmployeeById(id);
	}

	@Override
	public List<Employee> deleteEmployeeById(int id) {
		return employeeDao.deleteEmployeeById(id);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}

}
