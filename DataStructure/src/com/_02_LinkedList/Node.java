package com._02_LinkedList;

/**
 * Node is a utility
 * 
 */

public class Node {

	int value;
	public Node next;
	public Node(int value) {

		this.value = value;
		Node n = null;

	}

	public void appenToTail(int d) {
		Node temp = new Node(d);
		
		Node head = this;
		
		while(head.next!=null) {
			head = head.next;
		}
		head.next = temp;
		
	}
	
	
}
