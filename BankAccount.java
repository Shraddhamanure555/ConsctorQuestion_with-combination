package com.bank;
/*
 *2.
 * Define a BankAccount class with attributes: accountNumber, accountHolder, balance.
   Implement methods for deposit, withdraw, and displayAccountDetails.
   Ensure that withdrawal does not allow balance to go negative.
   Create a Main class to test various transactions.
*/
public class BankAccount {
	int accountNumber; // it is the instance/ fields / global / attributes / entity
	String accountHolder;
	double balance;
	
	public void deposit(double balance,int amount) {

		this.balance = balance;
		balance += amount;//  write like also balance = balceane +amount;
		System.out.println("Depostie Balance="+balance);
	}
	public void result(int accountNumber,String accountHolder,double balance) {
		System.out.println("AccountNumber="+accountNumber);
		System.out.println("AccountHolder="+ accountHolder);
		System.out.println("Depostie Balance="+balance);
		
		
	}
	
	
	public void  withdraw(double balance,int amount) {
	balance =  balance - amount;
		System.out.println("Avalabel balcne:"+balance);
		
		
		
	}
	 
	
}
