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
//		Department d4 = new Department(204, "Sales", "Nagpur");
		Department d5 = new Department(204, "Testing", "Pune");

		ArrayList<Employee> emp1 = new ArrayList<>();
		emp1.add(new Employee(206, "Yogesh", 92000, 200));
		emp1.add(new Employee(207, "Abhishek", 82000, 200));
		emp1.add(new Employee(208, "Sunish", 72000, 200));
		emp1.add(new Employee(209, "Pritam", 62000, 200));
		emp1.add(new Employee(210, "Bhakti", 45000, 201));

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
//		dep.put(d4, emp4);
		dep.put(d5, emp5);

		// Q1.Display All the department wise employee
		Set<Entry<Department, ArrayList<Employee>>> set = dep.entrySet();
		Iterator<Entry<Department, ArrayList<Employee>>> itr = set.iterator();
		// using this while loop we are printing departments List
		while (itr.hasNext()) {
			Entry<Department, ArrayList<Employee>> e = itr.next();
//			System.out.println("Keys: " + e.getKey());
//			System.out.println("Values: " + e.getValue());
			Department obj = e.getKey();
			System.out.println(obj.getD_name() + " " + obj.getD_id());
			ArrayList<Employee> arrlist = e.getValue();
			Iterator<Employee> ie = arrlist.iterator();
			// In this while loop we are printing employee ArrayList
			while (ie.hasNext()) {
				Employee ele = ie.next();
				System.out.println(ele);

			}

		}
		System.out.println(
				"--------------------------------------------------------------------------------------------");
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

//		SECOND WAY FOR QUESTION 2.
		Set<Entry<Department, ArrayList<Employee>>> set1 = dep.entrySet();
		Iterator<Entry<Department, ArrayList<Employee>>> itr1 = set1.iterator();
		// using this while loop we are printing departments List
		while (itr1.hasNext()) {
			Entry<Department, ArrayList<Employee>> e = itr1.next();
//			System.out.println("Keys: " + e.getKey());
//			System.out.println("Values: " + e.getValue());
			Department obj = e.getKey();
			System.out.println(obj.getD_name() + " " + obj.getD_id());
			ArrayList<Employee> arrlist = e.getValue();
			Employee e1 = null;
			Iterator<Employee> ie = arrlist.iterator();
			// In this while loop we are printing employee ArrayList
			double max1 = 0;
			while (ie.hasNext()) {
				Employee ele = ie.next();
				if (ele.getSalary() > max1) {
					max1 = ele.getSalary();
					e1 = ele;
				}
			}
			System.out.println(e1.e_name + " " + " Has Maximum Salary i.e.: " + max1);

		}

//		Q3 Display all the employee from IT department who is having salary less than 80k
//		
//		for(Entry<Department,ArrayList<Employee>>ob:set) {
//			
//			Iterator<Employee>obj=ob.getValue().iterator();
//			while(obj.hasNext()) {
//				Employee ell= obj.next();
//				if(ell.getSalary()==FindMaxSalary(ob.getValue())) {
//					System.out.println("\t"+ell);
//				}
//			}
		System.out.println("---------------------------------------------------");
		System.out.println("In IT Department salary less than 80,000");
		Set<Entry<Department, ArrayList<Employee>>> the = dep.entrySet();
		Iterator<Entry<Department, ArrayList<Employee>>> haa = the.iterator();

//		Set<Entry<Department,ArrayList<Employee>>>njj=dep.entrySet();
//		Iterator<Entry<Department,ArrayList<Employee>>>koo=njj.iterator();
//		
//		Set<Entry<Department,ArrayList<Employee>>>kll=dep.entrySet();
//		Iterator<Entry<Department,ArrayList<Employee>>>lpp=kll.iterator();
		while (haa.hasNext()) {
			Entry<Department, ArrayList<Employee>> e3 = haa.next();
			Department obj5 = e3.getKey();
			if (obj5.getD_name().equals("IT")) {
//				ArrayList<Employee>aaa=e3.getValue();

				ArrayList<Employee> elist = e3.getValue();
				Iterator<Employee> e4 = elist.iterator();
				while (e4.hasNext()) {
					Employee el1 = e4.next();
					if (el1.getSalary() < 80000) {
						System.out.println(el1);

					}
				}
			}
		}

		// Q3/1 Find employee who lives in same Location
		System.out.println("---------------------------------------");
		System.out.println("Find Who Lives In Same Location");
		Set<Entry<Department, ArrayList<Employee>>> kll = dep.entrySet();
		Iterator<Entry<Department, ArrayList<Employee>>> lpp = kll.iterator();
		while (lpp.hasNext()) {
			Entry<Department, ArrayList<Employee>> l1 = lpp.next();
			Department vo = l1.getKey();
			if (vo.getD_locaton().equals("Pune")) {
				System.out.println(vo);
			}

		}
		// Q4.Add the new employee in Testing department
		System.out.println("------------------------------------------");
		System.out.println("Adding new Employee in testing department");
		Set<Entry<Department, ArrayList<Employee>>> aa = dep.entrySet();
		Iterator<Entry<Department, ArrayList<Employee>>> aa2 = aa.iterator();
		while (aa2.hasNext()) {
			Entry<Department, ArrayList<Employee>> d = aa2.next();
			Department o = d.getKey();
			if (o.getD_name().equals("Testing")) {
				ArrayList<Employee> emlist = d.getValue();
				Employee em = new Employee(602, "Vidya", 25000, 204);
				emlist.add(em);
				dep.put(o, emlist);
//				System.out.println(dep);
			}
		}
		Set<Entry<Department, ArrayList<Employee>>> set4 = dep.entrySet();
		Iterator<Entry<Department, ArrayList<Employee>>> itr5 = set.iterator();
		// using this while loop we are printing departments List
		while (itr5.hasNext()) {
			Entry<Department, ArrayList<Employee>> e = itr5.next();
//			System.out.println("Keys: " + e.getKey());
//			System.out.println("Values: " + e.getValue());
			Department obj = e.getKey();
			System.out.println(obj.getD_name() + " " + obj.getD_id());
			ArrayList<Employee> arrlist = e.getValue();
			Iterator<Employee> ie = arrlist.iterator();
			// In this while loop we are printing employee ArrayList
			while (ie.hasNext()) {
				Employee ele = ie.next();
				System.out.println(ele);

			}

		}

		System.out.println("------------------------------------------------------");
		System.out.println("I hashcode and equals method in class");
		System.out.println(dep.get(new Department(204, "Testing", "Pune")));

		// Q5 Give department details in which maximum number of Employees working.
		System.out.println("-------------------------------------------------------");
		System.out.println("Department details in which Maximum Number of Employee Working");
		Set<Entry<Department, ArrayList<Employee>>> arr = dep.entrySet();
		Iterator<Entry<Department, ArrayList<Employee>>> arr1 = arr.iterator();
		Department obj6 = null;
		int count = 0;
		while (arr1.hasNext()) {
			Entry<Department, ArrayList<Employee>> ele1 = arr1.next();
			ArrayList<Employee> ex = ele1.getValue();
			if (ex.size() > count) {
				count = ex.size();
				obj6 = ele1.getKey();
			}

		}
		System.out.println(count+" "+dep);

	}

}
