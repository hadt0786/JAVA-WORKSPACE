package com._7Dec.CallHealth._02FoodOrder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class FoodOrder {

	static PrintWriter cout = new PrintWriter(System.out, true);
	static Scanner cin = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

	public static void close() {
		cout.close();
		cin.close();
	}

	public static void print(Double i) {

		cout.print(i.intValue());
		cout.flush();
	}

	public static void main(String[] args) throws Exception {
		int N = cin.nextInt(), K = cin.nextInt(), n = cin.nextInt(), m = cin.nextInt(), p = cin.nextInt();

//		if (N > 1 || K > 1 || n > 1 || m > 1 || p > 1)
//			throw new InputMismatchException();

		int temp = N - p;
		double d = p / K;
		double x = (temp) / ((d + 1) * m) - n;

		print(Math.ceil(x));

		close();
	}

}
