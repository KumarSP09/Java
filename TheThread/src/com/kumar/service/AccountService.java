package com.kumar.service;

import com.kumar.model.Accounts;

public class AccountService {

	//Accounts fromAccount;
	//Accounts toAccount;
	
	public double CreditAccount(Accounts CreditAccount, double txnAmount)
	{
		double balance =0;
		balance = CreditAccount.getAccountBalance() + txnAmount;
		CreditAccount.setAccountBalance(balance); 
		return balance;
		
	}
	
	public double DebitAccount(Accounts DebitAccount, double txnAmount)
	{
		double balance =0;
		balance = DebitAccount.getAccountBalance() - txnAmount;
		DebitAccount.setAccountBalance(balance); 
		return balance;
	}
	
}
