package com.simpleinnerclass;

public class Outer {
	int outer_n;

	public Outer() {
		// TODO Auto-generated constructor stub
		outer_n = 10;
	}

	public Outer(int outer_n) {
		this.outer_n = outer_n;
	}

	public void showOuterClass() {
		System.out.println("I am in outer class "+outer_n);
	}

	protected class inner {
		int inner_n;

		protected inner() {
			// TODO Auto-generated constructor stub
			inner_n = 20;

		}

		protected inner(int inner_n) {

			this.inner_n = inner_n;
		}

		public void showInnerClass() {
			System.out.println("I am in Inner class "+inner_n);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer();
		outer.showOuterClass();
		
		//
		inner inner = outer.new inner();
		inner.showInnerClass();
		
//		Outer.inner inner = outer.new inner();
//		inner.showInnerClass();
		
		

	}

}
