package com._02_LinkedList.palindrome;

import java.util.LinkedList;

public class Node {

	public char value;
	public Node next;

	public Node(char d) {
		this.value = d;
		Node n = null;
	}

	public boolean equals(Node a) {
		return this.value == a.value && this.next == a.next;
	}

	/**
	 * Checking the Linked List cycle 1 2 3 4 5 6 7 8 9 1 return 1
	 * 
	 */

	public void cycle() {

		Node temp = this;

		Node s = this;
		Node f = this;

		if (s == null || f == null)
			System.out.println("null");
		if (f.next != null)
			System.out.println(s.toString());

		while (s != null && f.next != null) {

			s = s.next;
			f = f.next.next;
			if (s.equals(f)) {
				break;
			}
		}

		Node flag = s;

		while (temp != s) {
			s = s.next;
			if (temp.equals(s)) {
				break;
			}

			while (s != flag) {
				s = s.next;

			}
			temp = temp.next;
			if (temp.equals(s)) {
				break;
			}

		}
		System.out.println(temp.value);

	}

	public static void main(String[] args) {
		LinkedList llist = new LinkedList();

		llist.push(20);
		llist.push(4);
		llist.push(15);
		llist.push(10);

		/* Create loop for testing */
		llist.head.next.next.next.next = llist.head;

		llist.cycle();
	}

	public void push(int new_data) {
		/*
		 * 1 & 2: Allocate the Node & Put in the data
		 */
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

}
