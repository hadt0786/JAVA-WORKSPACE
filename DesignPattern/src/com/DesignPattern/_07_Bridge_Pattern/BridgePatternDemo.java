package com.DesignPattern._07_Bridge_Pattern;

public class BridgePatternDemo {

	public static void main(String[] args) {

		Shape redCircle = new CircleExtShape(100,100,10, new RedCircle());
		Shape greenCircle = new CircleExtShape(100,100,10, new GreenCircle());
		
	
		redCircle.draw();
		greenCircle.draw();
	}

}
