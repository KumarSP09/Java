package com.kumar.action;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

import com.kumar.model.Accounts;
import com.kumar.util.TransactionOutput;
import com.kumar.util.TransactionThread;
import com.kumar.util.TransactionThreadCallable;

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
		TransactionThreadCallable txnThread2 = new TransactionThreadCallable();
		
		
		//txnThread1.setTxnType("DEBIT");
		txnThread1.setFromAccount(fromAccount);
		txnThread2.setFromAccount(fromAccount);
		
		//txnThread2.setTxnType("CREDIT");
		txnThread1.setToAccount(toAccount);
		txnThread2.setToAccount(toAccount);
		
		//Thread TransThread1 = new Thread(txnThread1);
		//Thread TransThread2 = new Thread(txnThread2);
		
		/* Runnable*/
		System.out.println("runnable");
		for (int i = 1; i <= 10; i++) {
			//TransThread1.start();
			//TransThread2.start();
			
			txnThread1.setTxnDrAmount(i*1000);
			txnThread1.setTxnCrAmount(i*1000);
			
			Thread TransThread = getThreads(txnThread1);
			
			System.out.println("*****"+TransThread.getName()+ " = "+ (i*100));
			
			TransThread.start();
		}
		
		System.out.println("Callable");
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		Future<TransactionOutput> future;
		for (int i = 1; i <= 10; i++) {
		
			txnThread2.setTxnDrAmount(i*1000);
			txnThread2.setTxnCrAmount(i*1000);
			
			future = executorService.submit(txnThread2);
			try {
				System.out.println(future.get().getDebit() + " "+future.get().getCredit());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		System.out.println("End");
		
		//=====================================================
		
		
		
	}

	public static Thread getThreads(TransactionThread ThreadClass)
	{
		return new Thread(ThreadClass);
	}
	
}
