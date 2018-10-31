package com.DesignPattern._05_Protype_Pattern;

public class RectangleExtShape extends Shape {
	
	public RectangleExtShape () {
		type = "Rectangle";
	}

	@Override
	void draw() {
System.out.println("Inside the rectangle : draw(): method");
	}

}
