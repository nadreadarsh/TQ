package com.multithreading;

public class Account {
	private long Balance=5000;
	public Account() {
		// TODO Auto-generated constructor stub
	
	}
	
	

	public long getBalance() {
		return Balance;
	}



	public void setBalance(long balance) {
		Balance = balance;
	}
	public void withdraw(int amount) {
		if(Balance>amount) {
			Balance = Balance - amount;
			System.out.println("The Ampount is withdraw by"+Thread.currentThread().getName());
		}else {
			System.out.println(Thread.currentThread().getName()+":Insufficient Amount");
		}
	}
	public void deposit(int rupees)
	{
		Balance=Balance+rupees;
		System.out.println("The amount is deposited by  " + Thread.currentThread().getName());
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account();

	}



	

}
