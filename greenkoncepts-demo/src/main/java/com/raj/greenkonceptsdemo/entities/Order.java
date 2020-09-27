/**
 * 
 */
package com.raj.greenkonceptsdemo.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;


/**
 * @author user
 *
 */

@Entity
@Table(name = "tblOrders")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long orderID;	
	
	@JsonBackReference
	@ManyToOne	
	@JoinColumn(name = "customerID")
	private Customer customer;
	
	
	@Column(name = "orderDetail")
	private String orderDetail;
	
	
	@Column(name = "orderAmount")
	private Float orderAmount;

	public Order() {}

	public long getOrderID() {
		return orderID;
	}


	public void setOrderID(long orderID) {
		this.orderID = orderID;
	}

	


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public String getOrderDetail() {
		return orderDetail;
	}


	public void setOrderDetail(String orderDetail) {
		this.orderDetail = orderDetail;
	}


	public Float getOrderAmount() {
		return orderAmount;
	}


	public void setOrderAmount(Float orderAmount) {
		this.orderAmount = orderAmount;
	}
	
	
}
