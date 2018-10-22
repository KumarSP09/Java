package com.kumar.util;

import com.kumar.model.Accounts;
import com.kumar.service.AccountService;

public class TransactionThread implements Runnable {

	private double txnAmount;
	private String txnType;
	
	private Accounts fromAccount;
	private Accounts toAccount;
	
	AccountService accountService = new AccountService();
	
	public Accounts getToAccount() {
		return toAccount;
	}
	public void setToAccount(Accounts toAccount) {
		this.toAccount = toAccount;
	}
	
	public double getTxnAmount() {
		return txnAmount;
	}
	public void setTxnAmount(double txnAmount) {
		this.txnAmount = txnAmount;
	}
	
	public String getTxnType() {
		return txnType;
	}
	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}
	
	public Accounts getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(Accounts fromAccount) {
		this.fromAccount = fromAccount;
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		if (getTxnType() == "CREDIT") 
		{
			System.out.println(Thread.currentThread().getName());
			double balance = accountService.CreditAccount(getFromAccount(), this.getTxnAmount());
			System.out.println(Thread.currentThread().getName()+" ====> "+balance);
		}
		else if (getTxnType() == "DEBIT") 
		{
			double balance = accountService.DebitAccount(getFromAccount(), this.getTxnAmount());
			System.out.println(Thread.currentThread().getName()+" ====> "+balance);
		}
		
		}
	
	
	
}
