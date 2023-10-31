package com.basic;

import java.util.Scanner;

class Account {
	String ac_name;
	long ac_num;
	String branch_name;
	String ifsc_num;
	long balance;
	long deposit_amount;
	long withdraw_amount;
	long initial_amount;

	public void setData(String account_name, long account_num, String branch$name, String ifscNumber,
			long balance_amount) {
		System.out.println("In SetData:-");
		ac_name = account_name;
		ac_num = account_num;
		branch_name = branch$name;
		ifsc_num = ifscNumber;
		balance = balance_amount;
		

	}

	public void displayData() {
		System.out.println("Account Name: " + ac_name);
		System.out.println("Account Number: " + ac_num);
		System.out.println("Branch Name: " + branch_name);
		System.out.println("Branch IFSC Number: " + ifsc_num);
		System.out.println("Account Balance: " + balance);
		System.out.println("Deposited Amount: " + deposit_amount);
		System.out.println("Withdraw Amount: " + withdraw_amount);
		System.out.println("Initial Amount: " + initial_amount);
	}

	public void depositAmount() {
		deposit_amount = initial_amount - balance;
		System.out.println(deposit_amount);

	}
	public void withdrawAmount() {
	withdraw_amount = deposit_amount + initial_amount;	
	System.out.println(withdraw_amount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Account obj = new Account();
		obj.setData( "Shree Ganesh Pharma,", 103021101699l, "Ashok Nagar", "SBI46679",
				80000);
		
		obj.depositAmount();
		obj.withdrawAmount();
		obj.displayData();
		

	}

}
