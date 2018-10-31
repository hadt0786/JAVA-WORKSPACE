package com.DesignPattern._02_Abstract_Factory_Pattern;

public class FactoryProducer {

	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("Shape")) {
			return new ShapefactoryExtAbsFact();
		} else if (choice.equalsIgnoreCase("Color")) {
			return new ColorfactoryExtAbsfactory();

		}
		return null;
	}

}
