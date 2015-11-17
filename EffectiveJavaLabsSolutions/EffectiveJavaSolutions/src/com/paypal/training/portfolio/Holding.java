package com.paypal.training.portfolio;

import java.math.BigDecimal;

public class Holding {
	private String symbol;
	private long numOfShares;
	private BigDecimal cost;
	
	
	public Holding(String symbol) {
		super();
		this.symbol = symbol;
	}
	public long getNumOfShares() {
		return numOfShares;
	}
	public void setNumOfShares(long numOfShares) {
		this.numOfShares = numOfShares;
	}
	public BigDecimal getCost() {
		return cost;
	}
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}
	public String getSymbol() {
		return symbol;
	}
	
	@Override
	public String toString()
	{
		return String.format("%d shares of %s", numOfShares, symbol);
	}
	
	
}
