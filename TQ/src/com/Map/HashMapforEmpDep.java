package com.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapforEmpDep {
	public static double FindMaxSalary(ArrayList<Employee> e) {
		double max = e.get(0).getSalary();
		for (int i = 0; i < e.size(); i++) {
			if (max < e.get(i).e_salary) {
				max = e.get(i).getSalary();
			}
		}

		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Department, ArrayList<Employee>> dep = new HashMap<>();
		Department d1 = new Department(200, "IT", "Pune");
		Department d2 = new Department(201, "HR", "Mumbai");
		Department d3 = new Department(203, "Finance", "Hyderabad");
		Department d4 = new Department(204, "Sales", "Nagpur");
		Department d5 = new Department(205, "Testing", "Pune");

		ArrayList<Employee> emp1 = new ArrayList<>();
		emp1.add(new Employee(206, "Yogesh", 92000, 200));
		emp1.add(new Employee(207, "Abhishek", 82000, 200));
		emp1.add(new Employee(208, "Sunish", 72000, 200));
		emp1.add(new Employee(209, "Pritam", 62000, 200));

		ArrayList<Employee> emp2 = new ArrayList<>();
		emp2.add(new Employee(210, "Bhakti", 45000, 201));
		emp2.add(new Employee(211, "Maroti", 44000, 201));
		emp2.add(new Employee(212, "Utkarsha", 62000, 201));
		emp2.add(new Employee(213, "Prashant", 50000, 201));

		ArrayList<Employee> emp3 = new ArrayList<>();
		emp3.add(new Employee(214, "Ulka", 82000, 202));
		emp3.add(new Employee(215, "Nishank", 61000, 202));
		emp3.add(new Employee(216, "Harshal", 71000, 202));
		emp3.add(new Employee(217, "Snehal", 19000, 202));

		ArrayList<Employee> emp4 = new ArrayList<>();
		emp4.add(new Employee(218, "Aadarsh", 41000, 203));
		emp4.add(new Employee(219, "Sudarshan", 32000, 203));
		emp4.add(new Employee(220, "Ganesh", 36000, 203));
		emp4.add(new Employee(221, "Prasad", 48000, 203));

		ArrayList<Employee> emp5 = new ArrayList<>();
		emp5.add(new Employee(222, "Suraj", 40000, 204));
		emp5.add(new Employee(223, "Akash", 24000, 204));
		emp5.add(new Employee(224, "Shivraj", 20000, 204));
		emp5.add(new Employee(225, "Sopan", 22000, 204));

		dep.put(d1, emp1);
		dep.put(d2, emp2);
		dep.put(d3, emp3);
		dep.put(d4, emp4);
		dep.put(d5, emp5);

		// Q1.Display All the department wise employee
		Set<Entry<Department, ArrayList<Employee>>> set = dep.entrySet();
		Iterator<Entry<Department, ArrayList<Employee>>> itr = set.iterator();
		while (itr.hasNext()) {
			Entry<Department, ArrayList<Employee>> e = itr.next();
			System.out.println("Keys: " + e.getKey());
			System.out.println("Values: " + e.getValue());
			
		}
		System.out.println("--------------------------------------------------------------------------------------------");
		// Q2.Find max salary long with employee details in all department
//		for(Entry<Department,ArrayList<Employee>>ob:set) {
//			System.out.println("Department: "+ob.getKey().getD_name());
//			Iterator<Employee>obj=ob.getValue().iterator();
//			while(obj.hasNext()) {
//				Employee ell= obj.next();
//				if(ell.getSalary()==FindMaxSalary(ob.getValue())) {
//					System.out.println("\t"+ell);
//				}
//			}
//			System.out.println();
//			}
		
//		Q3 Display all the employee from IT department who is having salary less than 80k
		
		for(Entry<Department,ArrayList<Employee>>ob:set) {
			
			Iterator<Employee>obj=ob.getValue().iterator();
			while(obj.hasNext()) {
				Employee ell= obj.next();
				if(ell.getSalary()==FindMaxSalary(ob.getValue())) {
					System.out.println("\t"+ell);
				}
			}
		
			
	}

	}
}
