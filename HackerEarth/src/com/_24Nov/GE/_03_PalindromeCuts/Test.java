package com._24Nov.GE._03_PalindromeCuts;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.*;

/**
 * Given problem TestClass case
 * 
 * 
 */

public class Test {

	public static boolean palindrome(String st) {
		int i = 0, j = st.length() - 1;
		for (i = 0; i < st.length() / 2; i++) {
			if (st.charAt(i) != st.charAt(j)) {
				return false;
			}
			j--;
		}
		return true;
	}

	public static long ways(int n, int r) {
		long numerator = 1, denominator = 1;
		n = n - 1;
		if (r > n - r) {
			r = n - r;
		}
		for (long i = 1L; i <= r; ++i) {
			denominator *= i;
		}
		for (long i = n - r + 1L; i <= n; ++i) {
			numerator *= i;
		}
		return numerator / denominator;
	}

	public static int count(int ways, int k, String given) {
		if(k<1 || k>given.length()-1) return 0;
		int head = k;
		Stack temp = null;
		int count = 0;
		String line = null;
		String rem = null;
		for (int i = 0; i <ways; i++) {
			for (int j = 0;j<k+1; j++) {
				line = given.substring(i, k);
				rem = given.substring(k);
			}
			if(palindrome(line)||palindrome(rem)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		try (Scanner cin = new Scanner(System.in);) {

			String[] l = cin.nextLine().trim().split(" ");
			int n = Integer.valueOf(l[0]);
			int k = Integer.valueOf(l[1]);
			String line = cin.nextLine();
			System.out.println();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
