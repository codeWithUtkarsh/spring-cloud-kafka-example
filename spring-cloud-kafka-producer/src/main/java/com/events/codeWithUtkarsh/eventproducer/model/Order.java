package com.events.codeWithUtkarsh.eventproducer.model;

import java.util.List;

public class Order {
    private String orderNumber;

    private String orderDate;

    private String customerName;

    private List<OrderItem> orderItems;
    
    public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(String orderNumber, String orderDate, String customerName, List<OrderItem> orderItems) {
		super();
		this.orderNumber = orderNumber;
		this.orderDate = orderDate;
		this.customerName = customerName;
		this.orderItems = orderItems;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
    
    
}
