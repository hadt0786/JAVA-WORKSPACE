package com._7Dec.CallHealth._01GiftVoucher;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * Distribute a gift among passenger at k th position
 * 
 * Input : N	M	K
 * 			6	3	2
 * 			1	4
 * 			5	4
 *			3	6
 *OutPut : 	2
 *			4	6	
 * 
 * **/

public class GiftVoucher {

	public class Node implements Comparable<Node> {
//		@Override
//		public String toString() {
//			return "[key=" + key + ", value=" + value + "]";
//		}

		int key, value;

		public Node(int a, int b) {
			this.key = a;
			this.value = b;
		}

		public int compareTo(Node n) {
			return n.value - this.value;
		}
	}

	static PrintWriter cout = new PrintWriter(System.out, true);
	static Scanner cin = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

	public static void close() {
		cin.close();
		cout.close();

	}

	public static void print(Integer input) {
		cout.println(input);
		cout.flush();
	}

	public static void main(String[] args) throws Exception {

		int N = cin.nextInt(), M = cin.nextInt(), K = cin.nextInt(), a, b;

		Node[] connections = new Node[N + 1];
		for (int n = 0; n <= N; n++) {
			connections[n] = new GiftVoucher().new Node(n, -n);
		}

		for (int i = 0; i < M; i++) {
			a = cin.nextInt();
			b = cin.nextInt();
			int temp = a;
			if (a > b) {
				a = b;
				b = temp;
			}
			if (connections[b].value > 0) {
				if (connections[b].value == a)
					continue;
				temp = a;
				a = b;
				b = temp;
				while (connections[b].value > 0) {
					b = connections[b].value;
				}
			}
			connections[b].value = a;
		}
//		print(connections);
//		for (int i = 1; i <= N; i++) {
//			for (int j = 1; j <= N; j++)
		int j = 1;
		int ii = 1;
		while (ii <= N) {
			if (j <= N) {
				if (connections[j].value < 0)
					continue;
				connections[j].value = connections[connections[j].value].value;
				j++;
			}
		}
		Arrays.sort(connections);
//		print(connections);
		int count = 0, flight = connections[1].value, total = 0;
		LinkedList<Node> result = new LinkedList<Node>();
		for (int i = 1; i <= N; i++) {
			if (connections[i].value != flight) {
				count = 1;
				flight = connections[i].value;
			} else {
				count++;
				if (count % K == 0) {
					total++;
					result.add(connections[i]);
				}
			}
		}
		print(total);
		for (int i = 0; i < result.size(); i++) {
			cout.print(result.get(i).key + " ");
			cout.flush();

		}

		close();
	}

}
