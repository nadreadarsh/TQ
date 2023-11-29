package com.LogicalProgram;

class Fiboseries2 {
	public void FibSeries() {
		int firstEle = 0, secEle = 1, terms = 10;
		System.out.println(firstEle + " " + secEle);
		for (int i = 2; i < terms; i++) {
			if (terms % 5 == 0)
				terms = firstEle + secEle;
			System.out.println();
			firstEle = secEle;
			secEle = firstEle;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fiboseries2 obj = new Fiboseries2();
		obj.FibSeries();

	}

}
