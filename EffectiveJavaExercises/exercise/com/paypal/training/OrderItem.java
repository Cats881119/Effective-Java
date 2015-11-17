package com.paypal.training;

public class OrderItem {
	private	MenuItem item;
	private	int	quantity;
	
	
	public OrderItem(){
		
	}
	
	public	OrderItem(MenuItem	item,	int	quantity){
		this.item = item;
		this.quantity = quantity;
	}
	public	MenuItem	getItem(){
		return item;
	}
	public	void	setItem(MenuItem	item){
		this.item = item;
	}
	public	int	getQuantity(){
		return quantity;
	}
	public	void	setQuantity(int	quantity){
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "OrderItem [item=" + item + ", quantity=" + quantity + "]";
	}
	

}
