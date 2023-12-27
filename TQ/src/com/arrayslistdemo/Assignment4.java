package com.arrayslistdemo;
/*Create arraylist of 10 integers. Insert an element at 7th position.*/
import java.util.ArrayList;
import java.util.Arrays;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		System.out.println(l1);
		l1.add(7,85);
		System.out.println(l1);


	}

}
