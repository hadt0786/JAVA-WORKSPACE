package com.essentialInterview;


public class Node{
	int d;
	Node child;

	public Node(int d) {
		this.d = d;
		this.child = null;
	}
	
	public void appendTail(int d) {
		Node tail = new Node(d);
		
		Node current = this.child;
		
		if(current.child==null) current.child = tail;
		
		while(current.child!=null) {
			current = current.child;
		}
		
		
		current.child = tail;
	}
}