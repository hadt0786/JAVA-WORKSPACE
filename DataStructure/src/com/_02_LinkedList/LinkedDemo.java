package com._02_LinkedList;

import java.util.Stack;

public class LinkedDemo {

	static Node link;

	public static void display(Node t) {
		while (t != null) {

			System.out.print(t.value + " ");
			t = t.next;
		}
	}

	/**
	 * 3,5,8,5,10,2,1 partiiton = 1 3,1,2,10,5,5,8
	 * 
	 * @param head of the linked list
	 * @partition - Node value
	 * 
	 */

	public static void partition(Node head, int partition) {
		// never use head value

		Node j = head;

		Node t = new Node(-1);
		t.next = head;
		Node i = t;

		int temp;
		while (j != null) {
			// smaller than throw in left
			if (j.value < partition) {
				temp = j.value;
				j.value = i.value;
				i.value = temp;
				i = i.next;

			}
			j = j.next;
		}

	}

	/**
	 * return k th element from te last
	 * 
	 * @param k element position from the last
	 *
	 */

	public Node removefromLast(int k, Node head) {

		Node fast = head;
		Node slow = head;

		for (int i = 0; i < k; i++) {
			if (fast.next != null) {
				fast = fast.next;
			} else
				return null;
		}

		while (fast != null) {
			fast = fast.next;
			slow = slow.next;
		}

		return slow;
	}

	/**
	 * Sum List
	 * 
	 * 6->9->7 + 2->9->5 o/p - > 9-1-2
	 * 
	 * 
	 */

//	public static Node sumList(Node head1, Node head2) {
//
//	}

	/**
	 * Linked list insert element
	 * 
	 * 
	 */

	public static void palindrome(Node head) {

		Stack test = new Stack();

		link.appenToTail(1);
		link.appenToTail(2);
		link.appenToTail(3);
		link.appenToTail(3);
		link.appenToTail(2);
		link.appenToTail(1);

		Node slow = head;
		Node fast = head;

		while (slow.next != null) {
			test.push(slow.value);
			slow = slow.next;
			fast = fast.next.next;
			System.out.println(test.pop() + " stack value");
			System.out.println(slow.value + " slow value ");
			System.out.println(fast.value + " fast value");

		}

	}

}
