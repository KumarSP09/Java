package com.kumar.util;

import javax.swing.plaf.synth.SynthColorChooserUI;

import com.kumar.model.Accounts;
import com.kumar.service.AccountService;

public class TransactionThread implements Runnable {

	private double txnCrAmount;
	private double txnDrAmount;
	//private String txnType;
	
	private Accounts fromAccount;
	private Accounts toAccount;
	
	AccountService accountService = new AccountService();
	
	public double getTxnDrAmount() {
		return txnDrAmount;
	}
	
	public void setTxnDrAmount(double txnDrAmount) {
		this.txnDrAmount = txnDrAmount;
	}
	
	public double getTxnCrAmount() {
		return txnCrAmount;
	}
	
	public void setTxnCrAmount(double txnCrAmount) {
		this.txnCrAmount = txnCrAmount;
	}
	
	public Accounts getToAccount() {
		return toAccount;
	}
	
	public void setToAccount(Accounts toAccount) {
		this.toAccount = toAccount;
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
		
		synchronized (accountService) {
	
		
		// if (getTxnType() == "DEBIT") 
		//{
			//System.out.println(this.getFromAccount().getAccountBalance());
			double Drbalance = accountService.DebitAccount(this.getFromAccount(), this.getTxnDrAmount());
			System.out.println(Thread.currentThread().getName()+ " --> A/c " +this.getFromAccount().getAccountNumber()+" Debit for "+
			            this.getTxnDrAmount() +" and Current Balance is "+ Drbalance);
		//}
		
			
		//else if (getTxnType() == "CREDIT") 
		//{
			//System.out.println(Thread.currentThread().getName());
			double Crbalance = accountService.CreditAccount(this.getToAccount(), this.getTxnCrAmount());
			System.out.println(Thread.currentThread().getName()+" --> A/c "+this.getToAccount().getAccountNumber()+" Credit with "
					+this.getTxnCrAmount()+ " and Current Balance is "+Crbalance);
		//}
		
	    }
	}
	
	
	
}
