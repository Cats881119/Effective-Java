package com.paypal.training;

import java.util.Iterator;
import java.util.List;

public class Order {
	
	private	String customerName;
	private	List<OrderItem>	orderItems;
	private	Table table;
	
	public Order(){
		
	}
	
	public	Order(String	customerName){
		this.customerName = customerName;
	}
	public	Order(String	customerName,	List<OrderItem>	items,	Table	table){
	}
	public	String	getCustomerName(){
		return customerName;
	}
	public	void	setCustomerName(String	customerName) throws Exception{
		if(customerName == null)
			throw new IllegalArgumentException();
		this.customerName = customerName;
	}
	
	public	List<OrderItem>	getItems(){
		return orderItems;
	}
	public void	changeOrder(List<OrderItem>	items){
		this.orderItems = items;
	}
	public	Table	getTable(){
		return table;
	}
	public	void	setTable(Table	table){
		this.table  = table;
	}
	public	void addOrder(OrderItem	oi) throws Exception{
		if(oi == null)
			throw new IllegalArgumentException();
		this.orderItems.add(oi);
	}
	
	public	double	getTotalPrice(){
	}

	@Override
	public String toString() {
		return "Order [customerName=" + customerName + ", orderItems="
				+ orderItems + ", table=" + table + "]";
	}
	

}
