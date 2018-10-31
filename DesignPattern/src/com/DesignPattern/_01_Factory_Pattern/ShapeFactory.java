package com.DesignPattern._01_Factory_Pattern;

public class ShapeFactory {

	// use getShape method to get the object of type shape

	public Shape getShape(String shapeType) {
		if (shapeType == null)
			return null;

		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new CircleImpleShape();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new ReactangleImplShape();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new SquareImpleShape();
		}

		return null;
	}

}
