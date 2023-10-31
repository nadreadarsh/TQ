package com.oops;

/*WAP to create class company with method address. 
 * create class eBay which extends company implement address() differently in eBay class.
 * Here the method address ()has been overridden in child class.*/
public class CompanyOverriden {
	CompanyOverriden() {

	}

	public void address() {
		System.out.println("At Post Sindhi Tq. Umri Dist. Nanded");
	}

	public class eBay extends CompanyOverriden {
		public void address(int i) {
			System.out.println("Near D-Mart canal road balaji nagar Nanded");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompanyOverriden obj = new CompanyOverriden();
		System.out.println(obj);
		obj.address();

	}

}
