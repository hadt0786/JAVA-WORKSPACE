package ds.circularLinkedList;

public class CircularLinkedList {

	private Node first;//null without assigning
	private Node last;//null without assigning
	
	public CircularLinkedList() {
		first = null;
		last = null;
		
	}
	public void insertFirst(int data) {
		Node newNode = new Node();
		
		newNode.data = data;
		
		if(isEmpty()) {
			last = newNode;
		}
		newNode.next = first;//new node -->old first
		first = newNode; //first place
	}
	private boolean isEmpty() {
		return first==null;
	}
	public void insertlast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			
			first = newNode;
		}
		else {
			last.next = newNode; //the next value of the last node will point to the new node
			last = newNode;// we make the new node we created be the last one in the list
			
			
		}
	}
	public int deleteFirst() {
		int temp = first.data;
		if(first.next==null) {
			last=null;
		}
		first = first.next;//first will point to the olds new value
		return temp;
	}
	
	public void displayList() {
		
		System.out.println("list(first-->last)");
		Node current = first;
		while(current!=null) {
			current.dispalyNode();
			current=current.next;
		}
		System.out.println();
		 
		
	}
	
	
	
	
	
	
	
	
	
}