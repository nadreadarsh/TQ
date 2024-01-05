package com.designpattern.singleton;

public class ShapeFactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape1 = ShapeFactory.getshape("Circle");
		shape1.draw();

		Shape shape2 = ShapeFactory.getshape("Rectangle");
		shape2.draw();

	}

}
