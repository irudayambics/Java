package com.raj.greenkonceptsdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raj.greenkonceptsdemo.entities.Customer;
import com.raj.greenkonceptsdemo.service.CustomerService;

/**
 * 
 * @author Irudaya Raj
 * End points for customer based APIs
 */

@RestController
@RequestMapping("/api/v1/customers")

public class CustomerAPI {
	
	@Autowired
	private CustomerService customerService;

	@PostMapping
    public ResponseEntity<Customer> create(@RequestBody Customer customer) {
		return ResponseEntity.ok(customerService.saveCustomer(customer));                
    }
	
	@GetMapping
	public ResponseEntity<List<Customer>> getCustomerOrders() {
		return ResponseEntity.ok(customerService.listCustomerOrdersSortByCustomerName());                
    }

}
