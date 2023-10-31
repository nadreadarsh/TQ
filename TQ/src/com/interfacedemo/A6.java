package com.interfacedemo;
/* with the help of interface and implements keyword 
 * we get print method from class pritable1*/
 class A6 implements Printable1{

	

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("I am Bhakti");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A6 b;
		b = new A6();
		b.print();

	}

}
