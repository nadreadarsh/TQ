package com.loop;

public class LoopDemo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write code to count number of odd numbers between 1 to 10
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2!=0)
				sum=sum+i;
		}
		System.out.println(sum);

	}

}
