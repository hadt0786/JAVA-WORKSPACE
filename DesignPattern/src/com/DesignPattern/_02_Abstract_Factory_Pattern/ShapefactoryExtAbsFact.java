package com.DesignPattern._02_Abstract_Factory_Pattern;

public class ShapefactoryExtAbsFact extends AbstractFactory {

	@Override
	Color getColor(String color) {

		return null;
	}

	@Override
	Shape getShape(String shapeType) {
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
