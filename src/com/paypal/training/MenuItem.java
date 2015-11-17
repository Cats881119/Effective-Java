package com.paypal.training;

import java.util.HashMap;
import java.util.Map;

public class MenuItem {
	
	private	String	name;
	private	double	price;

	static Map<String,MenuItem> menuItemMap = new HashMap<String,MenuItem>();
	
	private	MenuItem(String	name,	double	price){
		this.name = name;
		this.price = price;
	}
	public	static	MenuItem	getMenuItem(String	name){
		if(menuItemMap.containsKey(name)){
			return menuItemMap.get(name);
		}else{
			MenuItem mi = new MenuItem(name, 20);
			menuItemMap.put(name, mi);
			return mi;
		}
	}
	public	String	getName(){
		return name;
	}
	public	double getPrice(){
		return price;
	}
	@Override
	public String toString() {
		return "MenuItem [name=" + name + ", price=" + price + "]";
	}
	
}
