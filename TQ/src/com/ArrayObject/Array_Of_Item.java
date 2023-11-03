package com.ArrayObject;

/*Item class contains itemId,ItemName,itemCost.
1.Create Array of Item with size 5 and display it.     
2. Show itemNames with cost more than rs.2000      
3. Show item details with highest price.      
4. Show average price of all items.       
5. Increase the itemPrice by 200 whose itemPrice is below Rs.1000*/
public class Array_Of_Item {
	private int itemId;
	private String itemName;
	private int itemCost;

	Array_Of_Item() {
		System.out.println("I am in default constructor");

	}

	Array_Of_Item(int itemid, String itemname, int itemcost) {
		System.out.println("I am in parameterized constructor");
		this.itemId = itemid;
		this.itemName = itemname;
		this.itemCost = itemcost;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemCost(int itemCost) {
		this.itemCost = itemCost;
	}

	public int getItemCost() {
		return itemCost;
	}

	public void showArray(Array_Of_Item a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a);
		}
	}

	public void showCost(Array_Of_Item Cost[]) {
		int max = 2000;

		for (int i = 0; i < Cost.length; i++) {
			if (this.itemCost > max)
				System.out.println("Maximun Value: " + max);
		}

	}

	public void highestPrice(Array_Of_Item Cost[]) {
		int temp = 0;
		for (int i = 0; i < Cost.length; i++) {

			if (this.itemCost > temp) {

			}
			System.out.println(temp);
		}

	}

	public void showAvg(Array_Of_Item Cost[]) {
		int sum = 0;
		int avg = 0;
		for (int i = 0; i < Cost.length; i++) {
			sum = sum + Cost[i].itemCost;
		}
		avg = sum / Cost.length;
		System.out.println("Avg is: " + avg);

	}

	public void showItemPrice(Array_Of_Item Cost[]) {
		int price = 200;
		for (int i = 0; i < Cost.length; i++) {
			if (this.itemCost == 1000) {
				itemCost = itemCost + price;
			}
			System.out.println(Cost[i].itemName);

		}
	}

	public String toString() {
		return itemId + " item id " + itemName + " item name " + itemCost + "item cost";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array_Of_Item obj = new Array_Of_Item();
		Array_Of_Item[] arr;
		arr = new Array_Of_Item[5];
		arr[0] = new Array_Of_Item(101, "Almond", 2100);
		arr[1] = new Array_Of_Item(102, "Kaju", 1800);
		arr[2] = new Array_Of_Item(103, "Apple", 1500);
		arr[3] = new Array_Of_Item(103, "Banana", 1000);
		arr[4] = new Array_Of_Item(104, "abhishek", 1400);

		obj.showArray(arr);
		obj.highestPrice(arr);
		obj.showAvg(arr);
		obj.showCost(arr);
		obj.showItemPrice(arr);

	}

}
