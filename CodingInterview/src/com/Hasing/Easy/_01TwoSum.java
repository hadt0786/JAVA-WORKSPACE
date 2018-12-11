package com.Hasing.Easy;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Given array of integers you have to return the indices of sum of two values in the 
 * array
 * 
 * A = { 2, 7, 11, 15 } target = 9 return = [0, 1] --> in this case it will only return to values
 * 
 * 
 * **/

public class _01TwoSum {

	static PrintWriter cout = new PrintWriter(System.out, true);
	static Scanner cin = new Scanner( new BufferedReader( new InputStreamReader(System.in));

	public static void close() {
		cout.close();
		cin.close();
	}

	public static PrintWriter print(String t) {
		cout.print(t);
		cout.flush();
	}

	public static int[] ans (int[] nums, int target) {
		/**
		 * Click here to code
		 * */
		int [] val = new val[2];
		// Step 1: Sort the array
		nums = Arrays.sort(nums);
		print(nums);
		// Step 2: take the pivot point target 
		
		
		
		return val
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		int[] a = { 2, 7, 11, 15 };
		int target = 9;
		System.out.println(ans(a, target));

		close();
	}

}
