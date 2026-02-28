package com.test.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.dao.CustomerDao;
import com.test.entity.Customer;
import com.test.repository.CustomerRepository;

@Repository
public class CustomerDaoImpl implements CustomerDao{
	
	@Autowired
	private CustomerRepository repository;
	
	@Override
	public Customer saveCustomer(Customer cst) {
		return repository.save(cst);
	}

	@Override
	public Customer updateCustomer(Customer cst) {
		return repository.save(cst);
	}

	@Override
	public List<Customer> deleteCustomerById(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		return repository.findAll();
	}

	@Override
	public Optional<Customer> getCustomerById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
