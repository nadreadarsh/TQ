package com.oops;

public class AddTwoObj {
	private int dd, mm, yy;

	public void add(int d, int m, int y) {
		this.dd = d;
		this.mm = m;
		this.yy = y;
	}

	public void add(AddTwoObj obj1) {
		int ad = this.dd + obj1.dd;
		System.out.println(ad);

	}

	public static void main(String[] args) {
		AddTwoObj obj = new AddTwoObj();
		AddTwoObj obj2 = new AddTwoObj();
		obj.add(10, 12, 2023);
		obj2.add(18, 12, 2023);
		obj2.add(obj);
		

	}

}
