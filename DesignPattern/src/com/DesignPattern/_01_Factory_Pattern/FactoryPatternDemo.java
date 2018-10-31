package com.DesignPattern._01_Factory_Pattern;

public class FactoryPatternDemo {

	public static void main(String[] args) {

		ShapeFactory shapeFactory = new ShapeFactory();

		// get an object of a circle and call its draw shape

		Shape shapeCircle = shapeFactory.getShape("CIRCLE");

		// call draw method of Circle

		shapeCircle.draw();

		// get an object of a Rectangle and call its draw shape

		Shape shapeRectangle = shapeFactory.getShape("Rectangle");

		// call draw method of Rectangle

		shapeRectangle.draw();

		// get an object of a Square and call its draw shape

		Shape shapeSquare = shapeFactory.getShape("Square");

		// call draw method of Square

		shapeSquare.draw();

	}

}
