package bank2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bank2.BankAccount;

class BankAccoutTest {

	@Test
	void testGetName() {
		BankAccount account = new BankAccount("沥林清", 300000, 0.1);
		assertEquals("沥林清",account.getName());
		
	}

	@Test
	void testGetbalance() {
		BankAccount account = new BankAccount("沥林清", 300000, 0.1);
		assertEquals(300000, account.getbalance());
		
	}

	@Test
	void testDeposit() {
		BankAccount account = new BankAccount("沥林清", 300000, 0.1);
		assertEquals(400000, account.deposit(100000));
		
	}

	@Test
	void testWithdraw() {
		BankAccount account = new BankAccount("沥林清", 300000, 0.1);
		assertEquals(200000,account.withdraw(100000));
	
	}

	@Test
	void testInstallmentSavingPredict() {
		BankAccount account = new BankAccount("沥林清", 300000, 0.1);
		assertEquals(426500,account.installmentSavingPredict(12, 10000));
		
	}

	@Test
	void testFixedDepositPredict() {
		BankAccount account = new BankAccount("沥林清", 300000, 0.1);
		assertEquals(2740781,account.fixedDepositPredict(24, 2000000));
		
	}

}
