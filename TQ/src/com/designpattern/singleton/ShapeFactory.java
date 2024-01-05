package com.designpattern.singleton;

public class ShapeFactory {
	public static Shape getshape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("Circle")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
