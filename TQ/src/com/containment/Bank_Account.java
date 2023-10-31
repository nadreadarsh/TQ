package com.containment;

public class Bank_Account {
	int accno;
	String name;
	int balance;

	Bank_Account() {

	}

	Bank_Account(int accno, String name, int balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;

	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public int getAccno() {
		return accno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public String toString() {
		return "Account Number: " + accno +". Account Name: "+ name +" .Acount Balance: "+ balance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank_Account obj = new Bank_Account();
		System.out.println(obj);
		Bank_Account obj1 = new Bank_Account();
		System.out.println(obj1);

	}

}
