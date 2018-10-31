package com.DesignPattern._02_Abstract_Factory_Pattern;

public class ColorfactoryExtAbsfactory extends AbstractFactory {

	@Override
	Color getColor(String color) {

		if (color == null)
			return null;

		if (color.equalsIgnoreCase("GREEN")) {
			return new GreenImpleColor();
		} else if (color.equalsIgnoreCase("RED")) {
			return new RedImpleColor();
		} else if (color.equalsIgnoreCase("BLUE")) {
			return new BlueImpleColor();
		}

		return null;
	}

	@Override
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
