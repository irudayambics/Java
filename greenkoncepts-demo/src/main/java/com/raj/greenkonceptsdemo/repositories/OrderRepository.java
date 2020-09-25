/**
 * 
 */
package com.raj.greenkonceptsdemo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.raj.greenkonceptsdemo.entities.Order;

/**
 * @author Irudaya Raj
 * DB Transaction functions for order related operations
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
