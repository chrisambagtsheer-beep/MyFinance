package com.chrisambagtsheer.bankinsight;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TransactionTest {
	
	@Test
	void testDateTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Transaction(50.0, "Groceries", "2026-09-011", false);
		});
	}

	@Test
	void testDateTooShort() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Transaction(50.0, "Groceries", "2026-09-0", false);
		});
	}
	@Test
	void testDateWrongDashPlacement() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Transaction(50.0, "Groceries", "20260-9-01", false);
		});
	}
	
	@Test
	void testDateWrongCharactert() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Transaction(50.0, "Groceries", "2a26-09-01", false);
		});
	}
	
	@Test
	void testValidDate() {
		assertDoesNotThrow(() -> {
			new Transaction(50.0, "Groceries", "2026-09-01", false);
		});
	}
}
