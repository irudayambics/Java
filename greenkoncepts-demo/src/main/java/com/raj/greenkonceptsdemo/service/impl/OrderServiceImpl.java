/**
 * 
 */
package com.raj.greenkonceptsdemo.service.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raj.greenkonceptsdemo.entities.Order;
import com.raj.greenkonceptsdemo.repositories.OrderRepository;
import com.raj.greenkonceptsdemo.service.OrderService;

/**
 * @author user
 *
 */
@Service
public class OrderServiceImpl implements OrderService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OrderServiceImpl.class);
	
	@Autowired
	private OrderRepository orderRepository;

	public Order saveOrder(Order order) {
		if(order != null) {
			return orderRepository.save(order);
		} else {
			LOGGER.debug("Invalid customer data");
			
			// TODO: Write proper exception helper functions 
			throw new IllegalArgumentException();			 
		}
	}

}
