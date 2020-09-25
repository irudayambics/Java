package com.raj.greenkonceptsdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raj.greenkonceptsdemo.entities.Order;
import com.raj.greenkonceptsdemo.service.OrderService;

/**
 * 
 * @author Irudaya Raj
 * End points for order based APIs
 */

@RestController
@RequestMapping("/api/v1/orders")

public class OrderAPI {
	
	@Autowired
	private OrderService orderService;

	@PostMapping
    public ResponseEntity<Order> create(@RequestBody Order order) {
		return ResponseEntity.ok(orderService.saveOrder(order));                
    }
	
	@GetMapping
	public ResponseEntity<List<Order>> getOrders() {
		return ResponseEntity.ok(orderService.listOrdersSortByCustomerName());                
    }

}
