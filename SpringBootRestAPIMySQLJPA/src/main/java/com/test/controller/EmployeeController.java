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
import com.test.exceptions.EmployeeNotFoundException;
import com.test.repository.EmployeeRepository;
import com.test.service.EmployeeService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/employee/v1/api")
@Tag(name = "Employee CRUD Operations")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	@Autowired
	private EmployeeRepository repository;
	
	@PostMapping("/create")
	@Operation(summary = "Creating employee data")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee emp){
		Employee e = empService.saveEmployee(emp);
		
		if(e != null) {
			return new ResponseEntity<>(e, HttpStatus.CREATED);
		}else {
			return new ResponseEntity<>(e, HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/list")
	@Operation(summary = "listing all employees data")
	public ResponseEntity<List<Employee>> listAllEmployees(){
		List<Employee> list = empService.getAllEmployees();
		if(list.size() > 0) {
			return new ResponseEntity<>(list, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(list, HttpStatus.NOT_FOUND);
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
			return new ResponseEntity<>(e, HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{id}")
	@Operation(summary = "deleting employee data by id")
	public ResponseEntity<List<Employee>> deleteEmployeeById(@PathVariable int id){
		List<Employee> list = empService.deleteEmployeeById(id);
		if(list.size() > 0) {
			return new ResponseEntity<>(list, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(list, HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/{id}")
	@Operation(summary = "retrieving employee data by id")
	public ResponseEntity<Optional<Employee>> getEmployeeById(@PathVariable int id){
		Optional<Employee> emp = empService.getEmployeeById(id);
		if(emp != null) {
			return new ResponseEntity<>(emp, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(emp, HttpStatus.NOT_FOUND);
		}
	}
	
	//custom queries
	@GetMapping("/byname/{name}")
	@Operation(summary = "get employees by name")
	public ResponseEntity<List<Employee>> getEmployeeeByName(@PathVariable String name){
		
		List<Employee> list = repository.getEmployeeByName(name);
		
		if( list.size() > 0) {
			return new ResponseEntity<>(list, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(list, HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/bycmp/{company}")
	@Operation(summary = "get employees by company")
	public ResponseEntity<List<Employee>> getEmployeesByCompany(@PathVariable String company){
		List<Employee> list = repository.getEmployeeesByCompany(company);
		
		if( list.size() > 0) {
			return new ResponseEntity<>(list, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(list, HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/empList/asc")
	@Operation(summary = "get employees name in ascending order")
	public ResponseEntity<List<Employee>> getEmployeesByNameASC(){
		List<Employee> list =  repository.getEmployeesByNameASC();
		
		if( list.size() > 0) {
			return new ResponseEntity<>(list, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(list, HttpStatus.BAD_REQUEST);
		}
	}
}
