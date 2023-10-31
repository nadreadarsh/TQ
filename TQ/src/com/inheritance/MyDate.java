package com.inheritance;

public class MyDate {
	private int dd, mm, yy;

	public MyDate() {
		System.out.println("I am in default constructor of MyDate");
		dd = 17;
		mm = 10;
		yy = 2023;
	}

	public MyDate(int dd, int mm, int yy) {
		System.out.println("I am in parameterized constructorof MyDate");
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public void setDd(int d) {
		this.dd = d;
	}

	public int getDd() {
		return dd;
	}

	public void setMm(int m) {
		this.mm = m;
	}

	public int getMm() {
		return mm;
	}

	public void setYy(int y) {
		this.yy = y;
	}

	public int getYy() {
		return yy;
	}

	public void setData(int d, int m, int y) {
		dd = d;
		mm = m;
		yy = y;
	}

	public String toString() {
		return dd + "/" + mm + "/" + yy;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("i am in main class");

		MyDate obj = new MyDate();
		System.out.println(obj);
		obj.setDd(18);
		obj.setMm(10);
		obj.setYy(2023);
		System.out.println(obj);

	}

}
