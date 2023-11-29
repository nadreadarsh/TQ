package com.LogicalProgram;

public class FibonacciSeries {

	
		public void FiboSeries() {
		int firstEle=0,secEle=1,terms=10,thirdEle;
		System.out.print(firstEle +" "+secEle+ " ");
		for(int i=10;i<terms;i++)
		{
			thirdEle=firstEle+secEle;
			System.out.print(thirdEle);
			firstEle=secEle;
			secEle=firstEle;
		}

	}

}


