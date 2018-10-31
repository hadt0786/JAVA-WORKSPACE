package com.DesignPattern._05_Protype_Pattern;

public class PrototypePatternDemo {

	public PrototypePatternDemo() {

	}

	public static void main(String[] args) {
		ShapeCache.loadCache();

		Shape cloneShape1 = (Shape) ShapeCache.getShapeMap("1");

		System.out.println("Shape " + cloneShape1.getType());

		Shape cloneShape2 = (Shape) ShapeCache.getShapeMap("2");

		System.out.println("Shape " + cloneShape2.getType());

		Shape cloneShape3 = (Shape) ShapeCache.getShapeMap("3");

		System.out.println("Shape " + cloneShape3.getType());
	}

}
