package com.containment;

public class Sunish_Bank {
	String bankName;
	String address;
	int ifsccode;

	Sunish_Bank() {
		bankName = " ";
		address = " ";
		ifsccode = 546425;

	}

	public Sunish_Bank(String bankName, String address, int ifsccode) {
		this.bankName = bankName;
		this.address = address;
		this.ifsccode = ifsccode;

	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setIfscCode(int ifsccode) {
		this.ifsccode = ifsccode;
	}

	public String getBankName() {
		return bankName;
	}

	public String getAddress() {
		return address;
	}

	public int IfscCode() {
		return ifsccode;
	}

	public String toString() {
		return "Bank Name:" + bankName +". Bank Address: "+ address +". IFSC CODE: "+ ifsccode;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sunish_Bank s1 = new Sunish_Bank(" Sunish_Bank ", " New Mumbai ", 456859);
		System.out.println(s1);
		Bank_Account obj = new Bank_Account( 451264795 , " Sunish ", 00000);
		System.out.println(obj);

	}

}
