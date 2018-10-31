package com.DesignPattern._05_Protype_Pattern;

public class CircleExtShape extends Shape {

	public CircleExtShape() {
		type = "Circle";
	}

	@Override
	void draw() {
		System.out.println("Inside the circle : draw method");
	}

}
