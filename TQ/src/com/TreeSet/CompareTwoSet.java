package com.TreeSet;

import java.util.TreeSet;

public class CompareTwoSet {
	public void Compare(TreeSet<String> t, TreeSet<String> t3) {
		if (t.size() == t3.size()) {
			int cnt = 0;
			for (String x : t) {
				for (String y : t3) {
					if (x.equals(y)) {
						cnt++;
					}

				}
			}
			if (cnt == t.size()) {
				System.out.println("Two Set Are Same");
			} else {
				System.out.println("Two Set Are Different");
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> t = new TreeSet<>();
		t.add("Blue");
		t.add("Grey");
		t.add("White");
		t.add("Purple");
		t.add("Grey");
		TreeSet<String> t1 = new TreeSet<>();
		t1.add("Blue");
		t1.add("White");
		t1.add("Purple");
		t1.add("Grey");

		System.out.println("Two Set equals " + t.equals(t1));
		CompareTwoSet c = new CompareTwoSet();
		c.Compare(t, t1);

	}

}
