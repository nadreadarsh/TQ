package com.InnerClassAssignment;

/*Create class Outer in which you will have private , public , static and static final variables. Create
static and non static inner class*/
public class Assignment1outer {
	private int rollno;
	public String studentname;
	static double marks;
	static final char grade = 'A';

	public Assignment1outer() {
		// TODO Auto-generated constructor stub
		rollno = 1;
		studentname = "Abhishek";
		marks = 85;

	}

	public void displayouterclass() {
		System.out.println("rollno " + rollno + " Student Name " + studentname + " Marks " + marks + " Grade " + grade);
	}

	class nonstatisinner {
//		private int rollno1;
//		public String studentname1;
//		static double marks1;
//		static final char grade1 = 'A';
		public nonstatisinner() {
			// TODO Auto-generated constructor stub
//			rollno1=2;
//			studentname1="Sunish";
//			marks1=75;

		}

		public void displayinnerclass() {
			System.out.println(
					"rollno " + rollno + " Student Name " + studentname + " Marks " + marks + " Grade " + grade);
		}
	}

	static class staticinnerclass {
		public void displaystaticmethod() {
			// only static variable can access in static class
			System.out.println(" Marks " + marks + " Grade " + grade);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment1outer outer = new Assignment1outer();
		outer.displayouterclass();
		nonstatisinner innerns = outer.new nonstatisinner();
		innerns.displayinnerclass();
		staticinnerclass inners = new staticinnerclass();
//		inners.displaystaticmethod();
		inners.displaystaticmethod();

	}

}
