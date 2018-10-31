package ds.singlylinkedlist;
//tranverse the whole node till the last node-- demerit
public class SinglyLinkedList {
	
	private Node first;
	
	public SinglyLinkedList() {
		
	}
	public boolean isEMpty() {
		return(first==null);
	}
	//used to insert at the begining
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		first = newNode;
	}
	public void insertlast(int data) {
		Node current = first;
		while(current.next!=null) {
			current= current.next; //we will loop until current.next not equal to null
			
		}
		Node newNode=new Node();
		newNode.data = data;
		current.next = newNode;
	}
	
	public Node deleteFirst() {
		Node temp = first;
		first = first.next;
		return temp;
	}
	public void displayList() {
		System.out.println("list(FIrst-->last)");
		Node current = first;
		while(current!=null) {
			current.dispalyNode();
			current = current.next;
		}
		System.out.println();
	
	}
}
