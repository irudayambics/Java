/**
 * 
 */
package com.raj.greenkonceptsdemo.service.impl;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.raj.greenkonceptsdemo.entities.Customer;
import com.raj.greenkonceptsdemo.repositories.CustomerRepository;
import com.raj.greenkonceptsdemo.service.CustomerService;

/**
 * @author user
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerServiceImpl.class);
	
	@Autowired
	private CustomerRepository customerRepository;

	public Customer saveCustomer(Customer customer) {
		if(customer != null) {
			return customerRepository.save(customer);
		} else {
			LOGGER.debug("Invalid customer data");
			throw new IllegalArgumentException();			 
		}
	}
	

	public List<Customer> listCustomerOrdersSortByCustomerName() {
		return customerRepository.findAll(Sort.by(Sort.Direction.ASC, "customerName"));		
	}

}
