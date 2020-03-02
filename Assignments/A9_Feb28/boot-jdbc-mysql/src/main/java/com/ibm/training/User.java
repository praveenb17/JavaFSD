package com.ibm.training;

public class User {
	String Name, AccountType;
	int Balance, AccountNumber;

	public String getName() {
		return Name;
	}

	public User(String name, String accountType, int balance, int accountNumber) {
		super();
		Name = name;
		AccountType = accountType;
		Balance = balance;
		AccountNumber = accountNumber;
	}

	public User() {
		
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String accountType) {
		AccountType = accountType;
	}

	public int getBalance() {
		return Balance;
	}

	public void setBalance(int balance) {
		Balance = balance;
	}

	public int getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}
}
