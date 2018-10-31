package com.LinkedList;

public class Linked {

	// properties
	int data;
	Node head;

	public Linked() {
		super();
		this.head = null;
	}

	public void inserFirst(int data) {
		this.head = new Node(this.head, data);
	}

	public int size() {
		int count = 0;
		Node node = this.head;

		while (node != null) {
			count++;
			node = node.next;
		}
		return count;
	}

	public Node getFirst() {

		return this.head;

	}
	
	public Node getLast() {
	
		//complete
		if(this.head==null) {
			return null;
		}
		Node node = this.head;
		while(node!=null) {
			if() {
				return node;
				
			}
			node = node.next;
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
