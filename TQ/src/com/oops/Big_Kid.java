package com.oops;
/*Create a class BigKid which extends Kid created above. Implement readBook()
differently in BigKid class. Here the method readBook() has been over-ridden in
the child class BigKid()*/
public class Big_Kid extends Kid {
	public void Big_kid() {
		System.out.println("I am In Big_Kid Default constructor");
	}
	public void readBook() {
		System.out.println("I am reading a book and i am a big kid");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Big_Kid obj1 = new Big_Kid();
		System.out.println(obj1);
		obj1.readBook();
		obj1.readBook(2);

	}

}
