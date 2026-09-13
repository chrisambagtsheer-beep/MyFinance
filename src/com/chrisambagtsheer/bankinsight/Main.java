package com.chrisambagtsheer.bankinsight;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {

		List<Transaction> transactions = new ArrayList<>();
		transactions.add(new Transaction(50.0, "Groceries", "2026-09-01", false));
		transactions.add(new Transaction(800.0, "Housing", "2026/09-02", false));
		transactions.add(new Transaction(432.98, "Sports", "202-09-02", false));
		transactions.add(new Transaction(1500.0, "Salary", "2026-09-02-10", true));
		printAllTransactions(transactions);
		
		System.out.println("done!");
	}
	
	private static void printAllTransactions(List<Transaction> transactions) {
		for (Transaction t : transactions) {
			System.out.println(t.category + " : " + t.amount);
		}
	}
	
}
