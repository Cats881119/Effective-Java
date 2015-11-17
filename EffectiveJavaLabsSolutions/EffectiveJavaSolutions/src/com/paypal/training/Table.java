package com.paypal.training;

import java.util.HashMap;
import java.util.Map;

public class Table {

	private	int	number;
	private	int	numberOfSeats;
	static Map<Integer,Table> tableMap = new HashMap<Integer,Table>();

	
	public static Table	getTable(int number){
		if(tableMap.containsKey(number)){
			return tableMap.get(number);
		}else{
			Table table = new Table(number, 20);
			tableMap.put(number,table);
			return table;
		}	
	}
	
	private	Table(int	number,	int	numberOfSeats){
		this.number = number;
		this.numberOfSeats = numberOfSeats;
	}
	
	public	int	getNumber(){
		return number;
	}
	public int	getNumberOfSeats(){
		return numberOfSeats;
	}

	@Override
	public String toString() {
		return "Table [number=" + number + ", numberOfSeats=" + numberOfSeats
				+ "]";
	}
	
}
