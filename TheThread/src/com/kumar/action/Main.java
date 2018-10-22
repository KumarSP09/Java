package com.kumar.action;

import com.kumar.model.Accounts;
import com.kumar.util.TransactionThread;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Accounts fromAccount = new Accounts();
		Accounts toAccount = new Accounts();
		
		fromAccount.setAccountBalance(200000);
		fromAccount.setAccountNumber("500101");
		fromAccount.setAccountType("Saving");
		
		toAccount.setAccountBalance(100000);
		toAccount.setAccountNumber("300103");
		toAccount.setAccountType("Saving");
		
		TransactionThread txnThread1 = new TransactionThread();
		TransactionThread txnThread2 = new TransactionThread();
		
		txnThread1.setTxnAmount(10000);
		txnThread1.setTxnType("DEBIT");
		txnThread1.setFromAccount(fromAccount);
		
		txnThread2.setTxnAmount(20000);
		txnThread2.setTxnType("CREDIT");
		txnThread2.setToAccount(toAccount);
		
		Thread TransThread1 = new Thread(txnThread1);
		Thread TransThread2 = new Thread(txnThread2);
		TransThread1.start();
		TransThread2.start();
		System.out.println("End");
		
		
		
	}

}
