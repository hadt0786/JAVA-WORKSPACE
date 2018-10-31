package com._02_LinkedList.palindrome;

import java.util.LinkedList;
import java.util.Stack;

public class Linked_list {
	public Node head;

	public Linked_list(Node head) {
		this.head = head;
	}

	public void display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.value + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public int length() {
		Node temp = head;
		int size = 1;
		while (temp.next != null) {
			size++;
		}
		return size;
	}

	public static void insertNode(char d) {
		Node insert = new Node(d);
		Node temp = head;
	
		while (temp.next != null) {
			// System.out.println(temp.value);
			temp = temp.next;
		}
		temp.next = insert;

	}

	public void palindrome(String p) {

		for (int i = 0; i < p.length(); i++) {
			insertNode(p.charAt(i));

		}

		// display();

		Node s = this.head;
		Node f = this.head;

		Stack buffer = new Stack();
		while (f != null) {
			buffer.push(s.value);
			f = f.next.next;

			if (p.length() % 2 == 0) {

				s = s.next;
			} else {

				s = s.next.next;

			}

			while (s != null) {

				if (buffer.pop().equals(s.value)) {
					System.out.println("values are equal ");
				} else {
					System.out.println("false");
				}

			}

		}
	}


}
