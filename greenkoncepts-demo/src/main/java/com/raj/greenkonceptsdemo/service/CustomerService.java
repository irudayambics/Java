package com.raj.greenkonceptsdemo.service;

import java.util.List;

import com.raj.greenkonceptsdemo.entities.Customer;

/**
 * 
 * @author user
 * Component for service contract functions of customer module
 */
public interface CustomerService {

	public Customer saveCustomer(Customer customer);
	
	public List<Customer> listCustomerOrdersSortByCustomerName();
}
