package com.raj.greenkonceptsdemo.service;


import java.util.List;

import com.raj.greenkonceptsdemo.entities.Order;

/**
 * 
 * @author user
 * Component for service contract functions or order module
 */
public interface OrderService {

	public Order saveOrder(Order order);
	
	public List<Order> listOrdersSortByCustomerName();
	
}
