package com.basic;

public class Android extends Mobile {

	public void camera() {
		
		System.out.println("Click picture from camera");
		
	}
	public void price() {
		int price = 5000;
		System.out.println("price: "+price);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Android obj1 = new Android();
		obj1.camera();

		Mobile obj = new Mobile();
		obj.cell();
		obj.price();

	}

}
