package com.oops;

public class Account {
	private int accNo;
	private String ownerName;
	private double balance;

	public Account() {
		System.out.println("Detail Of Customer");
		accNo = 1699;
		ownerName = "Sunish";
		balance = 00000;
		System.out.println("Account Number:- " + accNo + " Customer Name: " + ownerName + " Account Balance: " + balance);
	}

	public void setAccno(int ac) {
		accNo = ac;

	}

	public int getAccno() {
		return accNo;
	}

	public void setOwnerName(String name) {
		ownerName = name;
	}

	public String getownerName() {
		return ownerName;
	}

	public void setBalance(double bal) {
		balance = bal;
	}

	public double getBalance() {
		return balance;
	}

	public void printDate() {
		System.out.println("Detail Of Customer :-" + accNo + " " + ownerName + " " + balance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account obj = new Account();
		obj.setAccno(1699);
		obj.setOwnerName("Sunish");
		obj.setBalance(0000);

	}

}
