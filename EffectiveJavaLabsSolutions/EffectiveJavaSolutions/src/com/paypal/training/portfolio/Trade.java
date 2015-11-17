package com.paypal.training.portfolio;

import java.math.BigDecimal;
import java.util.Date;

public class Trade {
	private String symbol;
	private TradeAction action;	// buy or sell
	private BigDecimal price; 	// Use BigDecimal forcurrency
	private int numOfShares;
	private Date tradeDate;

	public Trade(String symbol, TradeAction action, BigDecimal price,
			int numOfShares, Date tradeDate) {
		super();
		this.symbol = symbol;
		this.action = action;
		this.price = price;
		this.numOfShares = numOfShares;
		this.tradeDate = tradeDate;
	}

	public String getSymbol() {
		return symbol;
	}

	public TradeAction getAction() {
		return action;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public int getNumOfShares() {
		return numOfShares;
	}

	public Date getTradeDate() {
		return tradeDate;
	}
	
	
}
