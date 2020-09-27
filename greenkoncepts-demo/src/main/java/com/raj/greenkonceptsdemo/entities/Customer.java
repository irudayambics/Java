/**
 * 
 */
package com.raj.greenkonceptsdemo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * @author Irudaya Raj
 *
 */
@Entity
@Table(name = "tblCustomers")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long customerID;

	@Column(name = "customerName")
	private String customerName;

	@Column(name = "customerAge")
	private Integer customerAge;

	@Column(name = "customerAddress")
	private String customerAddress;
	
	
	@JsonManagedReference
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)	
	private List<Order> orders = new ArrayList<>();
	
	
	public Customer() {}

	/**
	 * @return the customerID
	 */
	public long getCustomerID() {
		return customerID;
	}

	/**
	 * @param customerID the customerID to set
	 */
	public void setCustomerID(long customerID) {
		this.customerID = customerID;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the customerAge
	 */
	public Integer getCustomerAge() {
		return customerAge;
	}

	/**
	 * @param customerAge the customerAge to set
	 */
	public void setCustomerAge(Integer customerAge) {
		this.customerAge = customerAge;
	}

	/**
	 * @return the customerAddress
	 */
	public String getCustomerAddress() {
		return customerAddress;
	}

	/**
	 * @param customerAddress the customerAddress to set
	 */
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	

}
