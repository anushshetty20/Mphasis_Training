package com.test.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.CustomerDao;
import com.test.entity.Customer;
import com.test.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerDao dao;
	
	@Override
	public Customer saveCustomer(Customer cst) {
		// TODO Auto-generated method stub
		return dao.saveCustomer(cst);
	}

	@Override
	public Customer updateCustomer(Customer cst) {
		// TODO Auto-generated method stub
		return dao.updateCustomer(cst);
	}

	@Override
	public List<Customer> deleteCustomerById(int id) {
		// TODO Auto-generated method stub
		return dao.deleteCustomerById(id);
	}

	@Override
	public Optional<Customer> getCustomerById(int id) {
		// TODO Auto-generated method stub
		return dao.getCustomerById(id);
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return dao.getAllCustomer();
	}

}
