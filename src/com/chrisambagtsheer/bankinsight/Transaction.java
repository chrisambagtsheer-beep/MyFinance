package com.chrisambagtsheer.bankinsight;

import java.util.ArrayList;
import java.util.List;

public class Transaction {

	// fields (instance variables) that can be used throughout the class
	double amount;
	String category;
	String date;
	boolean isIncome;

	// constructor; special method that takes arguments to set initial values to be
	// used throughout the class.
	public Transaction(double amount, String category, String date, boolean isIncome) {

		// Write this.variableName when the same variable name is in the constructor as
		// used throughout the class.
		this.amount = amount;
		this.category = category;
		this.date = date;
		this.isIncome = isIncome;
		
		if (isValidDate()) {
			System.out.println("Valid date inserted.");
		}
	}

	private boolean isValidDate() {
		int index = 0;

		if (this.date.length() != 10) {
			throw new IllegalArgumentException("Date is invalid - incorrect number of characters: " + this.date); 
		}

		while (index < this.date.length()) {
			boolean checkPositions = index == 4 || index == 7;
			if (!checkPositions && !Character.isDigit(this.date.charAt(index))) {
				throw new IllegalArgumentException("Date is invalid - wrong placement of dashes: " + this.date);
			} else if (checkPositions && this.date.charAt(index) != '-') {
				throw new IllegalArgumentException("Date is invalid - use dashes '-': " + this.date);
			}
			index++;
		}
		return true;
	}
}
