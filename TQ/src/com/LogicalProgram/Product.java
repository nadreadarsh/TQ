package com.LogicalProgram;

import java.util.Scanner;

class Product {
	int id;
	String name;
	String description;
	int quantity;
	String category;
	int price;
	int discount_price;
	int total_price;
	int after_discount_price;

	public void setData(int pid, String pname, String pdescription, int pquantity, String pcategory, int pprice,
			int product_discount, int totalPrice, int afterDiscPrice) {
		System.out.println("In set data");
		id = pid;
		name = pname;
		description = pdescription;
		quantity = pquantity;
		category = pcategory;
		price = pprice;
		discount_price = product_discount;
		total_price = totalPrice;
		after_discount_price = afterDiscPrice;
	}

	public void calculateDiscount() {
		int totalPrice = 0;
		int discount = 0;
		 int discountAmount = (totalPrice * quantity * discount) / 100;
	}

	public void discountPrice() {
		discount_price = (total_price * 5) / 100;
		System.out.println("discount_price");
	}

	public void displayProduct() {
		System.out.println("Product id: " + id);
		System.out.println("Product name:" + name);
		System.out.println("product Description:" + description);
		System.out.println("Product Quantity:" + quantity);
		System.out.println("Product Category:" + category);
		System.out.println("Product Price:" + price);
		System.out.println("Product Discount:- " + discount_price);
		System.out.println("product Total Price:- " + total_price);
		System.out.println("product after Discount Price:- " + after_discount_price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product eid:");
		int eid = sc.nextInt();
		System.out.println("Enter product name:");
		String ename = sc.next();
		Product obj = new Product();
		obj.setData(eid, ename, "aboab", 100, "veg", 2000, 5, 2000, 1800);
		obj.calculateDiscount();
		obj.displayProduct();

	}

}
