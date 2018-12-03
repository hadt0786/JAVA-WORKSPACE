package com._30Nov.Wissen;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class KPrime {
	
	static PrintWriter cout = new PrintWriter(System.out);
	static Scanner cin = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

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

	// utility function for finding a prime number
	public static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		if (n <= 3)
			return true;

		if (n % 2 == 0 || n % 3 == 0)
			return false;

		for (int i = 5; i <= (int) Math.sqrt(n); i += 6) {
			if (n % i == 0 || n % (i + 2) == 0)

				return false;
		}
		return true;
	}

	// find the nearest prime number and count the distance
	public static int ans(int[] distance, int K) {
		Arrays.sort(distance);
		for (int i = 0; i < distance.length; i++) {
			// System.out.println(distance[i]);
		}
		int sum = 0;
		for (int i = 0; i < K; i++) {

			sum += distance[i];
		}
		return sum;
	}

	public static int[] count(int[] given, int K) {
		int[] distance = new int[given.length];

		for (int i = 0; i < given.length; i++) {
			if (isPrime(given[i])) {
				// System.out.println(given[i] + " " + isPrime(given[i]));
				distance[i] = 0;
			} else {
				int val = given[i];

				while (!isPrime(val)) {

					val++;
					distance[i] = val - given[i];
				}
			}
//			for (int j = 0; j < distance.length; j++) {
//				System.out.println(distance[i]);
//			}

		}
		return distance;

	}

	public static void main(String[] args) {
		int N = cin.nextInt();
		int K = cin.nextInt();

		int[] given = new int[N];

		for (int i = 0; i < given.length; i++) {
			given[i] = cin.nextInt();
			// System.out.println(isPrime(given[i]));
		}

		int[] distance = count(given, K);
		String count1 = String.valueOf(ans(distance, K));
		// System.out.println(count1);
		println(count1);
		close();
	}

}
