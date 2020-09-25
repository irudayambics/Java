/**
 * 
 */
package com.raj.greenkonceptsdemo.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


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
	
	@Column(name = "customerID")
	private long customerID;
	
	@Column(name = "orderDetail")
	private String orderDetail;
	
	
	@Column(name = "orderAmount")
	private Float orderAmount;


	public long getOrderID() {
		return orderID;
	}


	public void setOrderID(long orderID) {
		this.orderID = orderID;
	}


	public long getCustomerID() {
		return customerID;
	}


	public void setCustomerID(long customerID) {
		this.customerID = customerID;
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
