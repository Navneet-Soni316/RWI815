package com.jsp;

public class BankAccount {
	long account_number;
	String account_holder;
	static double balance;
	
	public BankAccount(long account_number, String account_holder, double balance) {
		this.account_number = account_number;
		this.account_holder = account_holder;
		BankAccount.balance = balance;
	}

	public double deposit(double amount) {
		System.out.println("Amount deposited --> "+amount);
		System.out.println("Balance after deposite -->");
		BankAccount.balance= BankAccount.balance+amount;
		return BankAccount.balance;
	}
	
	public double withdraw(double amount) {
		System.out.println("Amount withdraw --> "+amount);
		System.out.println("Balance after withdraw -->");
		BankAccount.balance= BankAccount.balance-amount;
		return BankAccount.balance;
	}
	public static void main(String[] args) {
		BankAccount ba = new BankAccount(42572782L, "Mohan", 1000);
		System.out.println(ba.deposit(100));
		System.out.println(ba.withdraw(100));
//		BankAccount ba2 = new BankAccount(40572782L, "Maya", 100);
//		System.out.println(ba2.withdraw(10));
	}

	public long getAccount_number() {
		return account_number;
	}

	public void setAccount_number(long account_number) {
		this.account_number = account_number;
	}

	public String getAccount_holder() {
		return account_holder;
	}

	public void setAccount_holder(String account_holder) {
		this.account_holder = account_holder;
	}

	public static double getBalance() {
		return balance;
	}

	public static void setBalance(double balance) {
		BankAccount.balance = balance;
	}
	
	 
}
