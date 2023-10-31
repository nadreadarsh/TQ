package com.accessmodifier1;

/*public method doPublic, no access modifier method doDefault, protected method
doProtected, private method doPrivate.*/
public class Student {
	public int rollNo;
	protected int admissionNo = 10;
	int age;
	private int courseId = 101;

	Student() {

	}

	public void dopublic() {
		System.out.println(rollNo);

	}

	protected void doProtected() {
		System.out.println(admissionNo);
	}

	void doDefault() {
		System.out.println(age);
	}

	private void doPrivate() {
		System.out.println(courseId);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student();
		obj.doDefault();
		obj.doPrivate();
		obj.doProtected();
		obj.dopublic();

	}

}
