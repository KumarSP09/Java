package com.kumar.service;

import com.kumar.model.Accounts;

public class AccountService {

	//Accounts fromAccount;
	//Accounts toAccount;
	
	public double CreditAccount(Accounts CreditAccounts, double txnAmount)
	{
		double balance = 0;
		balance = CreditAccounts.getAccountBalance() + txnAmount;
		CreditAccounts.setAccountBalance(balance); 
		return balance;
		
	}
	
	public double DebitAccount(Accounts DebitAccounts, double txnAmount)
	{
		double balance = 0;
		//System.out.println(DebitAccounts.getAccountBalance());
		balance = DebitAccounts.getAccountBalance() - txnAmount;
		DebitAccounts.setAccountBalance(balance); 
		return balance;
	}
	
}
