package com.Map;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class StudentMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj1 = new Student(101, "Abhishek", 95);
		Student obj2 = new Student(102, "Yogesh", 98);
		Student obj3 = new Student(103, "Suraj", 97);
		Student obj4 = new Student(104, "Sunish", 85);
		Student obj5 = new Student(105, "Bhakti", 82);
		Student obj6 = new Student(105, "Bhakti", 82);

		HashMap<Student, String> stp = new HashMap<>();
		stp.put(obj1, "B.Sc.");
		stp.put(obj2, "B.CS");
		stp.put(obj3, "M.CA");
		stp.put(obj4, "Medical");
		stp.put(obj5, "M.B.A.");
		stp.put(obj6, "M.Sc.");
//		stp.put(obj2, "B.CS");
//		stp.put((new Student(107, "Maroti", 79)), "B.A.");
		Set<java.util.Map.Entry<Student, String>> std = stp.entrySet();
		Iterator<java.util.Map.Entry<Student, String>> itr = std.iterator();
		for (java.util.Map.Entry<Student, String> ob : std)
			System.out.println(ob.getKey() + "--->" + ob.getValue());

	}

}
