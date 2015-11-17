package com.paypal.training.portfolio;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Set;

public class Portfolio {
	private HashMap<String, Holding> holdings;

	public Portfolio() {
		holdings = new HashMap<String, Holding>();
	}

	public int getNumberOfHoldings() {
		return holdings.size();
	}

	public String[] getHoldingSymbols() {
		Set<String> symbols = holdings.keySet();
		String[] result = new String[0];
		result = symbols.toArray(result);
		return result;
	}

	public Holding getHolding(String symbol) {
		return holdings.get(symbol);
	}

	public void modifyPortfolio(Trade trade) {
		BigDecimal cost = trade.getPrice();
		cost = cost.multiply(new BigDecimal(trade.getNumOfShares()));

		Holding holding = holdings.get(trade.getSymbol());
		if (holding == null)
		{
			holding = new Holding(trade.getSymbol());
			holding.setCost(cost);
			holding.setNumOfShares(trade.getNumOfShares());
			holdings.put(trade.getSymbol(), holding);
		}
		else
		{
			holding.setCost(cost.add(cost));
			holding.setNumOfShares(holding.getNumOfShares() + trade.getNumOfShares());
		}
	}

	public boolean canSell(String symbol, long numOfSharesToSell) {
		Holding holding = holdings.get(symbol);
		if (holding == null)
		{
			return false;
		}
		return (holding.getNumOfShares() >= numOfSharesToSell);
	}

	@Override
	public String toString() {
		return holdings.toString();
	}
}
