package com.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class Apple {
	int price;
	String type;

	Apple() {

	}

	public Apple(int price, String type) {
		super();
		this.price = price;
		this.type = type;
	}

	public int getPricee() {
		return price;
	}

	public void setPrincee(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Apple [price=" + price + ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub

		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("in equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apple other = (Apple) obj;
		if (price != other.price)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Apple, Integer> appleMap = new HashMap<>();
		Apple a1 = new Apple(105, "Smila Apple");
		System.out.println(a1.hashCode());
		appleMap.put(a1, 200);

		Apple a2 = new Apple(300, "Washinton Apple");
		System.out.println(a2.hashCode());
		appleMap.put(a2, 2450);

		Apple a3 = new Apple(457, "Kashmir Apple");
		System.out.println(a3.hashCode());
		appleMap.put(a3, 3500);
		
		Apple a4 = new Apple(105, "Smila Apple");
		appleMap.put(a4, 450);
		System.out.println(a4.hashCode());
		System.out.println(appleMap.get(a4));

		Set<Entry<Apple, Integer>> set = appleMap.entrySet();
		Iterator<Entry<Apple, Integer>> itr = set.iterator();
		while (itr.hasNext()) {
			Entry<Apple, Integer> e = itr.next();
			System.out.println("Key: " + e.getKey());
			System.out.println("Value: " + e.getValue());

		}
		
	}

}
