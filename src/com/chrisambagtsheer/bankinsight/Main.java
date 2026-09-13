package com.chrisambagtsheer.bankinsight;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
//		// Variable types; String, int, double, boolean. 
//		// Name the variables with camelCase
//		// [type] [name] = [value];
//		String userName = "Chris Ambagtsheer";
//		int transactionAmount = 500;
//		double balance = 1000.0;
//		boolean isTransactionSuccessful = false;
//		
//		// Declare constants with final and use SCREAMING_SNAKE_CASE
//		// final [type] [name] = [value];
//		final int NUMBER_OF_ACCOUNTS = 1;
//		printInitializedVariables(userName, transactionAmount, balance, isTransactionSuccessful, NUMBER_OF_ACCOUNTS);
		
//		// Write double values always with a decimal for clarity.
//		double[] transactions = {0.0, 10.0, 100.0, 500.0, 5.0};
//		// Define an array either with values, or reserve its space in memory
//		double[] amounts = new double[5];
//		double totalAmount = transactionSummedTotal(transactions);
//		System.out.println(totalAmount);
	
//		String[] categories = {"Groceries", "University", "Culture", "Housing", "Sports"};
//		double[] amounts = {300.0, 50.0, 10.0, 1500.0, 40.0};
//		printAmountPerCategory(categories, amounts);
		
//		// Define a new object from the Transaction class
//		Transaction t = new Transaction(50.0, "Groceries", "2026-09-01", false);
//		printTransaction(t);
		
		// Create a list of Transaction objects that can infitely grow.
		// Use .get(), .size() and .add()
		List<Transaction> transactions = new ArrayList<>();
		transactions.add(new Transaction(50.0, "Groceries", "2026-09-01", false));
		transactions.add(new Transaction(800.0, "Housing", "2026-09-02", false));
		printAllTransactions(transactions);
//		printAllTransactionsShort(transactions);
		
		System.out.print("done!");
	}

//	private static void printInitializedVariables(String userName, int transactionAmount, double balance,
//			boolean isTransactionSuccessful, final int numberOfAccounts) {
//		// Print the variables
//		System.out.println(userName + " " +
//				transactionAmount + " " +
//				balance + " " +
//				isTransactionSuccessful + " " +
//				numberOfAccounts);
//	}
//
//	private static double transactionSummedTotal(double[] transactions) {
//		// Declare summing variable to use within for loop
//		double totalAmount = 0.0;
//		
//		// Loop over the array
//		// for (starting index); (exit condition); (increase index) {}
//		for (int i = 0; i < transactions.length; i++) {
//			
//			// += is short for variable = variable + value
//			// ++ is short for variable = variable + 1
//			totalAmount += transactions[i];
//		}
//		return totalAmount;
//	}
//
//	private static void printAmountPerCategory(String[] categories, double[] amounts) {
//		for (int i = 0; i < categories.length; i++) {
//			
//			if (categories[i].equals("University")) {
//				System.out.println("This month's expense for University is: 250 euro extra");
//				System.out.print("Total amount for university: ");
//				System.out.println(amounts[i] + 250);
//			} else {
//				System.out.println(categories[i] + " : " + amounts[i]);
//			}		
//		}
//	}
//	
//	private static void printTransaction(Transaction t) {
//		System.out.println(t.category + " : " + t.amount);
//	}
	
	private static void printAllTransactions(List<Transaction> transactions) {
		for (int i = 0; i < transactions.size(); i++) {
			Transaction t = transactions.get(i);
			System.out.println(t.category + " : " + t.amount);
		}
	}
	
//	private static void printAllTransactionsShort(List<Transaction> transactions) {
//		for (Transaction t : transactions) {
//			System.out.println(t.category + " : " + t.amount);
//		}
//	}
}
