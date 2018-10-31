package com._02_LinkedList.palindrome;

import java.util.Stack;

public class Main {

	public static void main(String... args) {
		// Node n = new Node(0);
		// test = new Linked_list(n);
		// testing inserNode

//		for(int i =1 ; i<10;i++) {
//			test.insertNode(i);
//			
//		}
		// testing display

		// test.display();

//		palindrome("abcddcbf"); // even legth
//		palindrome("abcdedcba"); // odd lengt

		Linked_list test = new Linked_list(new Node('1'));
		Linked_list test2 = new Linked_list(new Node('4'));
		String a_list = "23789";
		String b_list = "56789";

		for (int i = 0; i < a_list.length(); i++) {
			test.insertNode(a_list.charAt(i));

		}

		for (int i = 0; i < b_list.length(); i++) {
			test2.insertNode(b_list.charAt(i));

		}

		intersection(test, test2);

	}
	
	
	
	
	
		
	/**
	 * 
	 * **/
	
	

	/**
	 * Intersection of Linked list
	 * 
	 * A - 1 2 3 6 7 8 9 B - 4 5 6 7 8 9
	 * 
	 * @ Return 6 Node @ Node Ahead, Node Bhead
	 */

	public static Node intersection(Linked_list test1, Linked_list test2) {

		Node ans = null;

		Node Ahead = test1.head;
		Node Bhead = test2.head;

		Node a = Ahead;
		Node b = Bhead;

		int aLength = 0;
		int bLength = 0;

		if (a == null || b == null)
			return null;

		while (a.next != null || b.next != null) {

			aLength++;
			bLength++;
			a = a.next;
			b = b.next;
		}

		int diff = Math.abs(aLength - bLength);
		int count = 1;
		if (aLength > bLength) {

			while (count != diff) {
				Ahead = Ahead.next;
			}

		} else {
			while (count != diff) {
				Bhead = Bhead.next;
			}
		}

		while (a.next != null || b.next != null) {
			if (a == b) {
				ans = a;
				break;
			}

			else {
				a = a.next;
				b = b.next;
			}
		}

		System.out.println(ans.value);

		return ans;
	}

//	public static void palindrome(String p) {
//		test = new Linked_list(new Node(p.charAt(0)));
//		test.display();
//		for (int i = 1; i < p.length(); i++) {
//			test.insertNode(p.charAt(i));
//
//		}
//		test.display();
//		Node s = test.head;
//		Node f = test.head;
//		System.out.println(s.value);
//		Stack buffer = new Stack();
//
//		while (f != null && f.next != null) {
//			buffer.push(s.value);
//			f = f.next.next;
//
//			s = s.next;
//		}
//
////		buffer.push(s.value);
//		System.out.println(buffer.toString());
//
//		if (f != null && f.next == null) {
////			s = s.next.next;
//
//			s = s.next;
////		} else {
////			s = s.next;
//
//		}
//
//		while (s != null) {
//
//			if (buffer.pop().equals(s.value)) {
//
//				System.out.println("values are equal ");
//			} else {
//				System.out.println("false");
//			}
//			s = s.next;
//		}
//
//	}

}