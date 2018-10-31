package com._01_ArraysAndString;

/**
 * 
 * Rotate 90 degree
 * 
 * use upper triangle while transposing (try)
 * 
 */

public class RotateMatrix {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		int col = a[0].length;

		int row = a.length;
		//System.out.println(row);

		transpose(a, row, col);

	}

	public static void display(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static void reverse(int[][] a, int row, int col) {

		int[][] ans = new int[row][col];
		for (int i = row-1; i >= 0; i--) {

			for (int j = 0; j < col; j++) {
				ans[i][j] = a[row-i-1][j];
				// System.out.print(ans[i][j] + " ");
			}
		//	System.out.println();
		}
		display(ans);
	}

	private static void transpose(int[][] a, int row, int col) {

		int[][] transpose = new int[col][row];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				transpose[j][i] = a[i][j];

				// System.out.print(transpose[j][i]+" ");
			}
			// System.out.println();

		}
		int rowl = transpose.length;
		int coll = transpose[0].length;

		reverse(transpose, rowl, coll);

		display(transpose);
	}

}
