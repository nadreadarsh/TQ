package com.basic;

public class MyDate {
	private int dd, yy;
	
	int mm;
	public void setdata(int d, int m, int y) {
		dd = d;
		mm = m;
		yy = y;
	}

	public void DisplayData() {
		System.out.println("Data Is :- " + dd + "/" + mm + "/" + yy);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate obj = new MyDate();
		obj.setdata(16,10, 2023);
		obj.DisplayData();
		obj.dd=16;
		obj.mm=07;
		obj.yy=2023;

	}

}
