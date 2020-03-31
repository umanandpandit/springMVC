package com.niit.techno.crmnew.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.techno.crmnew.dao.CustomerDAO;
import com.niit.techno.crmnew.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService
{
@Autowired
private CustomerDAO customerDAO;

@Transactional
public void saveCustomer(Customer theCustomer) {
customerDAO.saveCustomer(theCustomer);

}

@Transactional
public List<Customer> getCustomers() {
	
	return customerDAO.getCustomers();
}

@Transactional
public Customer getCustomer(int theId) {
	
	return customerDAO.getCustomer(theId);
}

@Transactional
public void deleteCustomer(int theId) {
	
	customerDAO.deleteCustomer(theId);
}

}

