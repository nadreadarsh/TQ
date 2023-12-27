package com.Map;

public class Department {
	int d_id;
	String d_name;
	String d_locaton;

	Department() {

	}

	Department(int d_id, String d_name, String d_locaton) {

		this.d_id = d_id;
		this.d_name = d_name;
		this.d_locaton = d_locaton;
	}

	public int getD_id() {
		return d_id;
	}

	public void setD_id(int d_id) {
		this.d_id = d_id;
	}

	public String getD_name() {
		return d_name;
	}

	public void setD_name(String d_name) {
		this.d_name = d_name;
	}

	public String getD_locaton() {
		return d_locaton;
	}

	public void setD_locaton(String d_locaton) {
		this.d_locaton = d_locaton;
	}

	@Override
	public String toString() {
		return "Department [d_id=" + d_id + ", d_name=" + d_name + ", d_locaton=" + d_locaton + "]";
	}

	@Override
	public int hashCode() {
		return d_id;
	}

	@Override
	public boolean equals(Object obj) {
		Department d1 = new Department();
		if (this.d_id == d1.d_id)
			return true;
		else
			return false;

	}

}
