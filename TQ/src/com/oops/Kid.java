package com.oops;

/*WAJP2 create a class Kid with method readBook() and another method
readBook () with 2 parameters. The method readBook here is over-loaded (same
method name but different parameters)*/
public class Kid {
	Kid(){
		System.out.println("I am In default constructor");
	}

	public void readBook() {
		System.out.println("Kids are reading book");

	}

	public void readBook(int i) {
		System.out.println("Kids are Reading books in int i");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kid obj = new Kid();
		System.out.println(obj);
		obj.readBook();
		obj.readBook(1); 

	}

}
