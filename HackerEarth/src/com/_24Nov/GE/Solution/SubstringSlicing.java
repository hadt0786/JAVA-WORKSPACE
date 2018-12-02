package com._24Nov.GE.Solution;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SubstringSlicing {

	public static boolean solution(String input) {
		if (input.length() == 2) {
			if (input.charAt(0) == input.charAt(1))
				return true;
			else
				return false;
		}

		String rearrangedInput;
		int len = input.length();

		for (int i = 0; i < len - 1; i++) {

			if (input.charAt(i) == input.charAt(i + 1)) {

				rearrangedInput = rearrange(input.substring(0, i + 1), input.substring(i + 1, len));
//				System.out.println(rearrangedInput);
				if (palindrome(rearrangedInput)) {
					return true;
				}
			}
		}
		return false;
	}

	public static String rearrange(String p1, String p2) {
		return p2 + p1;
	}

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

	public static void main(String[] args) throws Exception {
		try (Scanner cin = new Scanner(System.in);) {
			int testCases = cin.nextInt();
			for (int i = 0; i < testCases; i++) {
				String str = cin.next();

				if (solution(str) == true)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		}

		catch (InputMismatchException ex) {
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.println(ex);
		}

	}

}
