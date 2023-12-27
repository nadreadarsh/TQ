package com.arrayslistdemo;

import java.util.ArrayList;

/*.        Create aarraylist of integers. Add first 50 odd numbers to arraylist.*/
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		int count = 0;
		for (int i = 1; count < 50; i = i + 2) {
			list.add(i);
			count++;

		}
		System.out.println(list);
		System.out.println(count);

	}

}
