package com.oops;

public class ArrayEmployee {
	private int eid;
	private String name;
	private MyDate doj;

	public void Employee() {

		eid = 0;
		name = "";
		doj = new MyDate();
	}

	public void Employee(int eid, String name, MyDate d) {
		this.eid = eid;
		this.name = name;
		this.doj = d;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDoj(MyDate o) {
		this.doj = o;
	}

	public int getEid() {
		return eid;
	}

	public String getEname() {
		return name;
	}

	public MyDate getDoj() {
		return doj;
	}

	public String toString() {
		return "Eid " + eid + " Ename " + name + " Date of Joining " + doj;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayEmployee obj = new ArrayEmployee();
		System.out.println(obj);
		MyDate d = new MyDate(10, 10, 2023);
		ArrayEmployee obj1 = new ArrayEmployee();
		System.out.println(obj1);

		ArrayEmployee obj2 = new ArrayEmployee();
		obj2.setDoj(new MyDate(20, 10, 2023));
		obj2.setEid(102);
		obj2.setName("Hardik");

		int id = obj.getEid();
		String name = obj.getEname();
		MyDate doj = obj.getDoj();
		System.out.println(id);
		System.out.println(name);
		System.out.println(doj);

	}

}
