package com.DesignPattern._05_Protype_Pattern;

public class SquareExtShape extends Shape {

	public SquareExtShape() {
		type = "Square";
	}

	@Override
	void draw() {
		System.out.println("Inside the square : draw method");
	}
	
	

}
