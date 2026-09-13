package com.chrisambagtsheer.bankinsight;

public class Transaction {
	
	// fields (instance  variables) that can be used throughout the class
	double amount;
	String category;
	String date;
	boolean isIncome;
	
	// constructor; special method that takes arguments to set initial values to be
	// used throughout the class. 
	public Transaction(double amount, String category, String date, boolean isIncome) {
		
		// Write this.variableName when the same variable name is in the constructor as
		// used throughout the class as convention.
		this.amount = amount;
		this.category = category;
		this.date = date;
		this.isIncome = isIncome;
	}
	
}
