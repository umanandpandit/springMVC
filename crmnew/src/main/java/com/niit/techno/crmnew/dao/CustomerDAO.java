package com.niit.techno.crmnew.dao;

import java.util.List;

import com.niit.techno.crmnew.model.Customer;

public interface CustomerDAO {

	public void saveCustomer(Customer theCustomer);

	public List<Customer> getCustomers();
	
	public Customer getCustomer(int theId);
	
	public void deleteCustomer(int theId);

}
