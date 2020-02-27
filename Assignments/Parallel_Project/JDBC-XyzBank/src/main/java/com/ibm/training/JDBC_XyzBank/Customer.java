
package com.ibm.training.JDBC_XyzBank;

public class Customer {
	
	public Customer(){
		
	}
	
	String Name;
	String AccountType;
	int AccountNumber;
	int Balance;
	
	public String getName() {
		return Name;
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
	
	public int getAccountNumber() {
		return AccountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}
	
	public int getBalance() {
		return Balance;
	}
	
}
