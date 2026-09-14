package com.chrisambagtsheer.bankinsight;

public class DollarConverter implements CurrencyConverter{
	
	@Override
	public double convertToCurrency(double amount, String currency) {
		double dollarInEuros = 0.87;
		double convertedAmount = 0;
		if (currency.equals("Dollar")){
			convertedAmount = amount * dollarInEuros;
		} else if (currency.equals("Euro")) {
			System.out.println("Amount already in euro, no need to convert.");
		} else {
			System.out.println("Incorrect currency selected."); 
		}
		
		return convertedAmount;
	}
}
