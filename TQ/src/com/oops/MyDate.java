package com.oops;

public class MyDate {
	private int dd, mm, yy;

	public MyDate(int d, int m, int y) {
		System.out.println("Its is a parameteteristed Constructor");
		dd = d;
		mm = m;
		yy = y;

	}

	public MyDate() {
		System.out.println("I Am a Default Constructor ");
		this.dd = 20;
		this.mm = 10;
		this.yy = 2023;
		System.out.println("Date is :- " + dd + "/" + mm + "/" + yy);

	}

	public void setDd(int d) {
		dd = d;
	}

	public int getDd() {
		return dd;
	}

	public void setMm(int m) {
		mm = m;
	}

	public int getMm() {
		return mm;
	}

	public void setYy(int y) {
		yy = y;
	}

	public int getYy() {
		return yy;
	}

	public void printData() {
		System.out.println("Date is :- " + dd + "-" + mm + "-" + yy);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate obj = new MyDate();
		obj.printData();
		obj.setDd(17);
		obj.setMm(10);
		obj.setYy(2023);
		obj.printData();

	}

}
