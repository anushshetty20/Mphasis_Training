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
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Customer;
import com.test.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@PostMapping("/create")
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer cst){
		Customer c = service.saveCustomer(cst);
		
		if(c != null) {
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		}else {
			return new ResponseEntity<>(c, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer cst, @PathVariable int id){
		cst.setId(id);
		Customer c = service.updateCustomer(cst);
		
		if(c != null) {
			return new ResponseEntity<>(c, HttpStatus.ACCEPTED);
		}else {
			return new ResponseEntity<>(c, HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<List<Customer>> deleteCustomer(@PathVariable int id){
		List<Customer> list = service.deleteCustomerById(id);
		
		if(list.size() > 0) {
			return new ResponseEntity<>(list, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(list, HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Customer>> getCustomerById(@PathVariable int id){
		Optional<Customer> c = service.getCustomerById(id);
		
		if(c != null) {
			return new ResponseEntity<>(c, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(c, HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<Customer>> getAllCustomer(){
		List<Customer> list = service.getAllCustomer();
		
		if(list.size() > 0) {
			return new ResponseEntity<>(list, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(list, HttpStatus.NOT_FOUND);
		}
	}
}
