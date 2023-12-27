package com.arrayslistdemo;

import java.util.ArrayList;
import java.util.Collections;
/* Sort arraylist of Strings*/
public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>arr=new ArrayList<>();
		arr.add("Black");
		arr.add("Pink");
		arr.add("Purple");
		arr.add("White");
		arr.add("Red");
		Collections.sort(arr);
		System.out.println(arr);

	}

}
