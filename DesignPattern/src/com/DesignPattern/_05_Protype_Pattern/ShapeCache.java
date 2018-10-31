package com.DesignPattern._05_Protype_Pattern;

import java.util.Hashtable;

public class ShapeCache {

	private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

	public ShapeCache() {

	}

	public static Shape getShapeMap(String string) {
		Shape cachedShape = shapeMap.get(shapeMap);

		return (Shape) cachedShape.clone();
	}

	// for each run database query and create shape

	// shapeMap.put(shapeKey, shape);
	// for example we are adding three shapes

	public static void loadCache() {
		CircleExtShape circle = new CircleExtShape();

		circle.setId("1");

		shapeMap.put(circle.getId(), circle);

		SquareExtShape square = new SquareExtShape();
		square.setId("2");
		shapeMap.put(square.getId(), square);

		RectangleExtShape rectangle = new RectangleExtShape();
		rectangle.setId("3");

		rectangle.put(rectangle.getId(), rectangle);

	}

}
