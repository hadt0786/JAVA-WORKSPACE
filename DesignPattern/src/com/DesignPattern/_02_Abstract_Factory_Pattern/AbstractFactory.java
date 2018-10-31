package com.DesignPattern._02_Abstract_Factory_Pattern;

public abstract class AbstractFactory {
	
	abstract Color getColor(String color);
	abstract Shape getShape(String shape);
	

}
