package com.DesignPattern._02_Abstract_Factory_Pattern;

public class AbstractFactoryPatterndemo {

	public static void main(String[] args) {

		// get shape

		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

		// get an object of Shape Circle

		Shape shape1 = shapeFactory.getShape("CIRCLE");

		// draw method of shape circle

		shape1.draw();

		Shape shape2 = shapeFactory.getShape("SQUARE");

		// draw method of shape circle

		shape2.draw();

		Shape shape3 = shapeFactory.getShape("RECTANGLE");

		// draw method of shape circle

		shape3.draw();

		// get color

		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

		// get an object of Shape Circle

		Color color1 = colorFactory.getColor("RED");

		// draw method of color red

		color1.fill();

		// get an object of color blue

		Color color2 = colorFactory.getColor("BLUE");

		// draw method of COLOR

		color2.fill();

		// get an object of COLOR GREEN

		Color color3 = colorFactory.getColor("GREEN");

		// draw method of shape circle

		color3.fill();

	}

}
