package com.kumar.util;

import java.util.concurrent.Callable;

import com.kumar.model.Accounts;
import com.kumar.service.AccountService;

public class TransactionThreadCallable implements Callable<TransactionOutput> {

	private double txnCrAmount;
	private double txnDrAmount;
	//private String txnType;
	
	private TransactionOutput TxnOut = new TransactionOutput();
	
	private Accounts fromAccount;
	private Accounts toAccount;
	
	AccountService accountService = new AccountService();
	
	public TransactionOutput getTxnOut() {
		return TxnOut;
	}

	public void setTxnOut(TransactionOutput txnOut) {
		TxnOut = txnOut;
	}

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
	

//	//@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		
//		// if (getTxnType() == "DEBIT") 
//		//{
//			//System.out.println(this.getFromAccount().getAccountBalance());
//			double Drbalance = accountService.DebitAccount(this.getFromAccount(), this.getTxnDrAmount());
//			System.out.println(Thread.currentThread().getName()+ " --> A/c " +this.getFromAccount().getAccountNumber()+" Debit for "+
//			            this.getTxnDrAmount() +" and Current Balance is "+ Drbalance);
//		//}
//		
//			
//		//else if (getTxnType() == "CREDIT") 
//		//{
//			//System.out.println(Thread.currentThread().getName());
//			double Crbalance = accountService.CreditAccount(this.getToAccount(), this.getTxnCrAmount());
//			System.out.println(Thread.currentThread().getName()+" --> A/c "+this.getToAccount().getAccountNumber()+" Credit with "
//					+this.getTxnCrAmount()+ " and Current Balance is "+Crbalance);
//		//}
//		
//		}

	@Override
	public TransactionOutput call() throws Exception {
		// TODO Auto-generated method stub
		double Drbalance = accountService.DebitAccount(this.getFromAccount(), this.getTxnDrAmount());
		//System.out.println(Thread.currentThread().getName()+ " --> A/c " +this.getFromAccount().getAccountNumber()+" Debit for "+
		      //      this.getTxnDrAmount() +" and Current Balance is "+ Drbalance);
	//}
	
		
	//else if (getTxnType() == "CREDIT") 
	//{
		//System.out.println(Thread.currentThread().getName());
		double Crbalance = accountService.CreditAccount(this.getToAccount(), this.getTxnCrAmount());
		//System.out.println(Thread.currentThread().getName()+" --> A/c "+this.getToAccount().getAccountNumber()+" Credit with "
			//	+this.getTxnCrAmount()+ " and Current Balance is "+Crbalance);

		TxnOut.setDebit(Thread.currentThread().getName()+ " --> A/c " +this.getFromAccount().getAccountNumber()+" Debit for "+
		            this.getTxnDrAmount() +" and Current Balance is "+ Drbalance);
		
		TxnOut.setCredit(Thread.currentThread().getName()+" --> A/c "+this.getToAccount().getAccountNumber()+" Credit with "
				+this.getTxnCrAmount()+ " and Current Balance is "+Crbalance);
		
		return TxnOut;
	}
	
	
	
}
