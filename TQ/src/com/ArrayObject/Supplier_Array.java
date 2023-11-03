package com.ArrayObject;

/*Supplier class Contains supid,supName and array of itemsSUpplied.
 *  * Item class contains itemId,ItemName,itemCost.
 *   *  1Create 2 Item type arrays with size 5 and associate them with two Supplier objects.
 *  2. Show item details supplied by each supplier.*/
public class Supplier_Array {
	private int supId;
	private String supName;

	Supplier_Array() {

	}

	Supplier_Array(int supId, String supName) {
		this.supId = supId;
		this.supName = supName;

	}

	public void setSupId() {
		this.supId = supId;

	}

	public int getSupId(int supId) {
		return supId;
	}
	public void setSupName() {
		this.supName=supName;
	}
	public String getSupName() {
		return supName;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier_Array obj1 = new Supplier_Array();
		Supplier_Array[] arr1;
		arr1 = new Supplier_Array[5];

	}

}
