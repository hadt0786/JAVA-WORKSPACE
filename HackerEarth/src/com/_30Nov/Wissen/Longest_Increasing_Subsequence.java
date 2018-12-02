package com._30Nov.Wissen;

import java.io.PrintWriter;
import java.util.Scanner;

public class Longest_Increasing_Subsequence {

	static PrintWriter cout = new PrintWriter(System.out);
	static Scanner cin = new Scanner(System.in);

	// printing a printwriter
	public static void println(String print) {
		cout.println(print);
		cout.flush();
		// cout.close();
	}

	// closing a printwriter and scanner
	public static void close() {
		cin.close();
		cout.close();
	}

	// if query 1 : X Y change the character position X to Y

	// if query 2 : print the output

	//

	public static void main(String[] args) {

		// n --> length of the String
		int n = cin.nextInt();

		// String S converting to Charcater array
		char s[] = cin.next().toLowerCase().toCharArray();

		// debug-- printing charcater array

//		for (int i = 0; i < s.length; i++) {
//			System.out.println(s[i]);
//		}

		// Number of Queries

		int q = cin.nextInt();

		// each queries followed by q lines
		String[] line = new String[q];
		while (q > 0) {
			// check which type of query
			// if 1 -- will have followed X And Y
			line[q] = cin.nextLine();

			q--;
		}
		for (int i = 0; i < line.length; i++) {
			System.out.println(line[i]);
		}
		close();
	}

}