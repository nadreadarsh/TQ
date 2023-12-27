package com.arrayslistdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Ass10Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Ass10Employee>arr= new ArrayList<>();
		arr.add(new Ass10Employee(101,"Abhishek",25000,(new Ass10Department(201,"IT"))));
		arr.add(new Ass10Employee(102,"Sunish",22000,(new Ass10Department(202,"HR"))));
		arr.add(new Ass10Employee(103,"Bhakti",15000,(new Ass10Department(203,"Finance"))));
		arr.add(new Ass10Employee(104,"Adarsh",29000,(new Ass10Department(201,"Bank"))));
		
		
			for(Ass10Employee x : arr)
				System.out.println(x);
			

	}

}
