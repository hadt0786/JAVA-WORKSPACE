package com._01_ArraysAndString;

import java.util.Scanner;

/**
 * Find A Unique Character in a String
 * 
 **/

public class UniqueCharacter {

	public static void main(String[] args) {

		String test = "AKASH";

		int hi = test.length() - 1;
		int low = 0;


		

	}
	
	
	

	private static void quickSort(String test, int low, int hi) {

		if (low < hi) {

			int pivot = partition(test, low, hi);

			quickSort(test, low, pivot - 1);
			quickSort(test, pivot + 1, hi);
		}

	}

	private static int partition(String test, int low, int hi) {

		int pivot = test.charAt(hi);
		char[] testChar = test.toCharArray();

		int i = low - 1;

		for (int j = 0; j < hi; j++) {
			if (testChar[j] <= pivot) {
				i++;

				// swapping

				char temp = testChar[i];
				testChar[i] = testChar[j];
				testChar[j] = temp;

			}
		}
		
		
		
		char temp = testChar[i+1];
		testChar[i+1] = testChar[hi];
		testChar[hi] = temp;
		
		
		return i + 1;
	}

}
