package com.AnonymousClass;

public class AnonymousOuterClass {
	Demo d = new Demo() {
		int ai = 20;
		{
			System.out.println("In instance in it block");

		}

		public void show() {
			super.show();
			System.out.println("In AIC show " + ai);
			newMethodAIC();
		}

		public void newMethodAIC() {
			System.out.println("In new Method");
		}
	};

	Myinterface ii = new Myinterface() {
		@Override
		public void test() {
			System.out.println("This is test of A.I.C");

		}
	};

	public void show() {
		Demo d = new Demo() {

		};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousOuterClass o = new AnonymousOuterClass();
		o.d.show();
		o.ii.test();
	}

}

class Demo {
	int data = 10;

	public Demo() {

	}

	public void show() {
		System.out.println("From Demo classs show " + data);

	}

}

interface Myinterface {
	public void test();
}
