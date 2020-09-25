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

	public List<Order> listOrdersSortByCustomerName() {
		return orderRepository.findAll(Sort.by(Sort.Direction.DESC, "customerName"));		
	}

}
