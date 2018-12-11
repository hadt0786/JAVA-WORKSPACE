package com.Enums;

enum Directions {
	NORTH, SOUTH, EAST, WEST;
	// duplicates not allowed
	int i;

	private enums() {
		// hv constructor
	}

	void methodOfEnum() {
		// hv methods
	}
}

public class EnumExample {

	public static void main(String[] args) {
		Byte B = new Byte((byte) 10);
		byte b = B.byteValue();
		System.out.println(b);

		System.out.println();
		Directions d1 = Directions.NORTH;
		System.out.println(d1);

		Directions d2 = Directions.EAST;
		System.out.println(d2);

		Directions d3 = Directions.WEST;
		System.out.println(d3);

		System.out.println();

		System.out.println(d1.compareTo(d2.NORTH));

	}

}
