package com.arrayslistdemo;

import java.util.ArrayList;
import java.util.Iterator;

/*Create aarraylist of integers. Add first 50 odd numbers to arraylist*/
public class ArrayListoddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> num = new ArrayList<>();
		int count = 1;
		for (int i = 0; i <= 50; i++) {
			if (count % 2 != 0) {
				i = i + 2;

			}
			System.out.println(count);
		}
			
//		int count=0;,
//		while(true) {
//			count++;
//		}

	}

}
