/**
 * 
 */
package com.raj.greenkonceptsdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raj.greenkonceptsdemo.entities.Customer;

/**
 * @author Irudaya Raj
 * DB Transaction functions for customer related operations
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
