package com._30Nov.Wissen;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Longest_Increasing_Subsequence {

	public static PrintWriter cout = new PrintWriter(System.out);
	public static Scanner cin = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

	// printing a printwriter

	public static void println(StringBuilder stringBuilder) {
		cout.println(stringBuilder);
		cout.flush();
		// cout.close();
	}

	// closing a printwriter and scanner
	public static void close() {
		cin.close();
		cout.close();
	}

	// if query 1 : X Y change the character position X to Y

	public static String query1(String given, int index, char a) {
		StringBuilder temp = new StringBuilder(given);
		// System.out.println(temp);
		int set = index - 1;
		temp.setCharAt(set, a);
		// System.out.println(temp);
		return new String(temp);
	}

	// query 2 : print the output

	public static int query2(char[] given) {
		if (given == null)
			return 0;
		if (given.length == 0)
			return 0;

		List<Integer> l = new ArrayList<Integer>(given.length);
		// int [] l = new int[given.length];
		for (int set : given) {
			if (l.size() == 0 || set > l.get(l.size() - 1)) {
				l.add(set);
			} else {
				// binary search
				int low = 0;
				int high = l.size() - 1;

				while (low < high) {

					int mid = (low + high) / 2;

					if (l.get(mid) < set) {
						low = mid + 1;
					} else {
						high = mid;
					}
				}

				l.set(high, set);
			}
		}
		// System.out.println(l.toString());

		return l.size();
	}

	public static void main(String[] args) {

		while (cin.hasNextLine()) {
			int n = cin.nextInt();
			if(n<1 || n>100000) throw new InputMismatchException();
			String s = cin.next();
			if(s.length()!=n) throw new InputMismatchException();

			int q = cin.nextInt();

			for (int i = 0; i < q; i++) {
				int index = 0;
				String c = "";
				int j = cin.nextInt();
				if (j == 1) {
					index = cin.nextInt();
					c = cin.next();
					s = query1(s, index, c.charAt(0));

				}
				if (j == 2) {
					println(new StringBuilder(String.valueOf(query2(s.toCharArray()))));
				}

			}

		}
		close();

	}

}
