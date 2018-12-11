package com.toptal;

import java.util.Stack;

public class RemoveOccureance {

	public static void main(String[] args) {

		String s = "accbbaac";

		Stack<Character> t = new Stack<Character>();
		Stack<Character> q = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			t.push(s.charAt(i));
		}
//		System.out.println(t.toString());
		while (!t.isEmpty()) {
			char c = t.pop();
			if (!q.isEmpty()) {
				if (q.peek() == c) {
					q.pop();
				} else
					q.push(c);
			} else {
				q.push(c);
			}
//			System.out.println(t.toString());
//			System.out.println(q.toString());

		}
//		System.out.println(q.toString());
		while (!q.isEmpty()) {
			t.push(q.pop());
		}
//		System.out.println(t.toString());
//		System.out.println(t.size());
		char[] c = new char[t.size()];
		for (int i = t.size() - 1; i >= 0; i--) {
			c[i] = t.pop();

		}
		System.out.println(new String(c));
	}
}
