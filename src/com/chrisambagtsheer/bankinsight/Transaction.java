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

		checkDate();
	}

	private boolean isValidDate(String date) {
		int index = 0;
		boolean validation = true;

		if (date.length() != 10) {
			validation = false;
		}

		while (index < date.length()) {
			boolean checkPositions = index == 4 || index == 7;
			if (!checkPositions && !Character.isDigit(date.charAt(index))) {
				validation = false;
			} else if (checkPositions && date.charAt(index) != '-') {
				validation = false;
			}
			index++;
		}
		return validation;
	}

	private void checkDate() {
		boolean validDate = isValidDate(date);
		if (validDate) {
			System.out.println("The date check out.");
		} else {
			System.out.println("The date is invalid.");
		}
	}

}
