package com.inheritance;
/*WAP to create class shape with method draw().
 * create class circle, square, Rectangle which extends Shape implement draw()
 *  differently in each child.*/
public class Square {
	
	public void draw() {
		System.out.println("I can draw a painting in square shape");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape obj = new Shape();
		obj.draw();
		

	}

}
