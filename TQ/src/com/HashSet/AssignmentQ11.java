package com.HashSet;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class AssignmentQ11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer>link2= new LinkedHashSet<>();
		link2.add(46);
		link2.add(16);
		link2.add(96);
		link2.add(56);
		link2.add(79);
		link2.add(85);
		System.out.println(link2);
		
		
		Integer arr[]= new Integer[link2.size()];
		link2.toArray(arr);
		System.out.println(Arrays.toString(arr));

	}

}
