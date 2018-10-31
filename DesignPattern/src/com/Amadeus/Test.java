package com.Amadeus;

public class Test {

	public static void main(String[] args) {

		int level;
		int length = 10;
		int index;
		String key = "abcdefghijklTnopqrstuvwxyz";

		for (level = 0; level < key.length(); level++) {
			index = key.charAt(level) - 'T';
			System.out.println(index);

		}
		for(int i =0; i<255;i++) {
			System.out.println("the Asccii value at "+i+" "+(char)i);
		}

	}
}
