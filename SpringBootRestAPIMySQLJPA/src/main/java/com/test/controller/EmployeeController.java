package com.test.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Employee;
import com.test.service.EmployeeService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/employee/v1/api")
@Tag(name = "Employee CRUD Operations")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	@PostMapping("/create")
	@Operation(summary = "creating employee data")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee emp){
		Employee e = empService.saveEmployee(emp);
		
		if(e != null) {
			return new ResponseEntity<>(e, HttpStatus.CREATED);
		}else {
			return new ResponseEntity<>(e, HttpStatus.NO_CONTENT);
		}
	}
	
	@GetMapping("/list")
	@Operation(summary = "listing all employees data")
	public ResponseEntity<List<Employee>> listAllEmployees(){
		List<Employee> list = empService.getAllEmployees();
		if(list.size() > 0) {
			return new ResponseEntity<>(list, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(list, HttpStatus.NO_CONTENT);
		}
	}
	
	@PutMapping("/{id}")
	@Operation(summary = "updating employee data by id")
	public ResponseEntity<Employee> updateEmployeeById(@RequestBody Employee emp, @PathVariable int id){
		emp.setId(id);
		Employee e = empService.updateEmployee(emp);
		
		if(e != null) {
			return new ResponseEntity<>(e, HttpStatus.ACCEPTED);
		}else {
			return new ResponseEntity<>(e, HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping("/{id}")
	@Operation(summary = "deleting employee data by id")
	public ResponseEntity<List<Employee>> deleteEmployeeById(@PathVariable int id){
		List<Employee> list = empService.deleteEmployeeById(id);
		if(list.size() > 0) {
			return new ResponseEntity<>(list, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(list, HttpStatus.NO_CONTENT);
		}
	}
	
	@GetMapping("/{id}")
	@Operation(summary = "retrieving employee data by id")
	public ResponseEntity<Optional<Employee>> getEmployeeById(@PathVariable int id){
		Optional<Employee> emp = empService.getEmployeeById(id);
		if(emp != null) {
			return new ResponseEntity<>(emp, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(emp, HttpStatus.NO_CONTENT);
		}
	}
}
