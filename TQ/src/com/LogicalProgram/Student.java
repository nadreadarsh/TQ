package com.LogicalProgram;

class Student {
	int rollnum;
	String studentname;
	long contactnum;
	String mail;
	double math;
	double science;
	double english;
	double marathi;
	double history;
	float percentage;
	int grade;

	public void setData(int RollNum, String Name, long Contact, String Email, int Mathematics, int Science, int English,
			int Marathi, int History, int Percentage, int Grade) {
		System.out.println("Set Data In()");
		rollnum = RollNum;
		studentname = Name;
		contactnum = Contact;
		mail = Email;
		math = Mathematics;
		science = Science;
		english = English;
		marathi = Marathi;
		history = History;
		percentage = Percentage;
		grade = Grade;

	}

	public void DisplayPercentage() {
		int math = 85;
		int science = 88;
		int english = 92;
		int marathi = 98;
		int history = 78;
		float percentage;
		// char Grade;

		percentage = ((math + science + english + marathi + history) * 100) / 500;

		System.out.println("Student Percentage:- " + percentage);
		if (percentage >= 80) {
			System.out.println("Student Grade:- A+");
		} else if (percentage >= 60) {
			System.out.println("Student Grade:- A");
		} else if (percentage >= 40) {
			System.out.println("Student Grade:- B");
		} else {
			System.out.println("Student Grade:- Fail");
		}

	}

	public void DisplayStudent() {
		System.out.println("Student Roll Number:- " + rollnum);
		System.out.println("Student Name:- " + studentname);
		System.out.println("Student Contact:- " + contactnum);
		System.out.println("Student Email:- " + mail);
		System.out.println("Student Math Score:- " + math);
		System.out.println("Student sci. Score:- " + science);
		System.out.println("Student Eng Score:- " + english);
		System.out.println("Student marathi Score:- " + marathi);
		System.out.println("Student History Score:- " + history);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student();
		obj.setData(45, "Shivraj", 7066646404l, "Shivraj007@gmail.com", 85, 88, 92, 98, 78, 0, 0);
		obj.DisplayStudent();
		obj.DisplayPercentage();

	}
}
