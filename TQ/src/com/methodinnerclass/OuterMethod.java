package com.methodinnerclass;

public class OuterMethod {
	int outer_n;

	public OuterMethod() {
		// TODO Auto-generated constructor stub
		outer_n = 10;
	}

	public void OuterMethod() {
		class inner {
			int inner_n;

			public inner() {
				// TODO Auto-generated constructor stub
				inner_n = 40;

			}

			public void showmethod() {
				System.out.println("I am in the inner class of outer method " + inner_n);
				System.out.println("I am in the inner class of method but outer class variable " + outer_n);

			}
		}
		inner inner = new inner();
		inner.showmethod();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterMethod outer = new OuterMethod();
		outer.OuterMethod();

	}

}
