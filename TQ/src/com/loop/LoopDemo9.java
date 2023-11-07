package com.loop;

public class LoopDemo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write code to display sum of even numbers between 1 to 20
		int sum=0;
		int i=1;
		for(i=1;i<=20;i++)
		{
			if(i%2==0)
			sum=sum+i;
		}
		System.out.println(sum);

	}

}
