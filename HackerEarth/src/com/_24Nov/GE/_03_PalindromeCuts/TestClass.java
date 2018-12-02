package com._24Nov.GE._03_PalindromeCuts;

import java.util.Scanner;

/**
 * N = 5 K =2 string - abbav
 * 
 * return = 12
 */

public class TestClass {

	private String input;
	private int len, k;
	private String slice;
	private int[][] pals;
	private int sum = 0;

	public TestClass(String st,int k){
		input = st;
		len = st.length();
		this.k = k;
		pals = new int[len+1][len+1];
		for(int i=0;i<=len;i++){
			for(int j=0;j<=len;j++){
				if((i+1)==j) pals[i][j] = 1;
				else pals[i][j] = -1;
			}
		}
		slice = new String(input);
	}

	public int cutAndCount(int st, int end, int parent, int k) {
//		System.out.println("[" + st + "," + end + "," + k +","+sum+ "]");
		if (k == 0) {
//			System.out.println(input.substring(st,end));
			if (pals[st][end] == -1) {
				pals[st][end] = palindrome(input.substring(st, end)) ? 1 : 0;
			} else if (pals[st][end] == 1) {
				pals[st][parent]++;
			}
			sum += pals[st][end];
			return pals[st][end];
		} else {
			int count = 0;
			int f = 0, s = 0;
			for (int i = st + 1; i <= len - k; i++) {
				f = cutAndCount(st, i, parent, 0);
//				sum += f;
				//System.out.println("[" + st + "," + i + "," + 0 + "] + " + "[" + i + "," + end + "," + (k - 1) + "]");
				//System.out.println("first cut: " + f);
				s = cutAndCount(i, end, parent, k - 1);
				//System.out.println("second cut: " + s);
//				sum+=s;
				//System.out.println(sum);
			}
			return sum;
		}

	}
	public void getTable() {
		for (int i = 0; i < pals.length; i++) {
			for (int j = 0; j < pals[0].length; j++) {
				System.out.print(pals[i][j] + " ");
			}
			System.out.println();
		}
	}

	public int addTable() {
		int count = 0;
		for (int i = 0; i < pals.length; i++) {
			for (int j = 0; j < pals[0].length; j++) {
				if (pals[i][j] > 0)
					count += pals[i][j];
			}
		}
		return count;
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

	public static void main(String[] args) {

		try (Scanner cin = new Scanner(System.in);) {

			String[] l = cin.nextLine().trim().split(" ");
			int n = Integer.valueOf(l[0]);
			int k = Integer.valueOf(l[1]);
			String line = cin.nextLine();
			System.out.println();
			TestClass pc = new TestClass(line, k);
//			System.out.println(pc.cuts());
			System.out.println(pc.cutAndCount(0, n, n, k));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}