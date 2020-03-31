package com.niit.techno.crmnew.service;

import java.util.List;

import com.niit.techno.crmnew.model.Customer;

public interface CustomerService {

	void saveCustomer(Customer theCustomer);
	
	public List<Customer> getCustomers();

	public Customer getCustomer(int theId);
	
	public void deleteCustomer(int theId);
	
}
