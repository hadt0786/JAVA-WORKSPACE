package com._24Nov.GE.Solution;

import java.util.Scanner;

public class PalindromeCuts {

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