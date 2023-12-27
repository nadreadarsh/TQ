package com.HashSet;

import java.util.Arrays;
import java.util.LinkedHashSet;

/* Do all above assignments using LinkedHashSet*/
public class AssignmentQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String>link=new LinkedHashSet<>();
		link.add("Abhishek");
		link.add("Sudarshan");
		link.add("Ganesh");
		link.add("Prashant");
		link.add("Ishwar");
		link.add("Bhakti");
		String[]s=new String[link.size()];
		link.toArray(s);
		System.out.println(Arrays.toString(s));
		for(String x:link)
			System.out.println(x);
//		System.out.println(link);
		LinkedHashSet<Integer>link2= new LinkedHashSet<>();
		link2.add(46);
		link2.add(16);
		link2.add(96);
		link2.add(56);
		link2.add(79);
		link2.add(85);
		System.out.println(link2);
		Object arr[]=link2.toArray();
		System.out.println(Arrays.toString(arr));
		Integer arr1[]=new Integer[link2.size()];
		link2.toArray(arr1);
		System.out.println(Arrays.toString(arr1));
	
		
		

	}

}
