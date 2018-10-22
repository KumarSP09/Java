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
		//TransactionThread txnThread2 = new TransactionThread();
		
		
		//txnThread1.setTxnType("DEBIT");
		txnThread1.setFromAccount(fromAccount);
		
		//txnThread2.setTxnType("CREDIT");
		txnThread1.setToAccount(toAccount);
		
		//Thread TransThread1 = new Thread(txnThread1);
		//Thread TransThread2 = new Thread(txnThread2);
		
		for (int i = 0; i < 10; i++) {
			//TransThread1.start();
			//TransThread2.start();
			
			txnThread1.setTxnDrAmount(i*1000);
			txnThread1.setTxnCrAmount(i*1000);
			
			Thread TransThread = getThreads(txnThread1);
			
			System.out.println("*****"+TransThread.getName()+ " = "+ (i*100));
			
			TransThread.start();
		}
		System.out.println("End");
		
	}

	public static Thread getThreads(TransactionThread ThreadClass)
	{
		return new Thread(ThreadClass);
	}
	
}
