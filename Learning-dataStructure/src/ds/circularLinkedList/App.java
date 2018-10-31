package ds.circularLinkedList;

public class App {
	//Circular linked list --> give access to last , far more efficient in inserting in start and last
	
	public static void main(String[] args) {
		CircularLinkedList mylist= new CircularLinkedList();
		mylist.insertFirst(1);
		mylist.insertFirst(2);
		mylist.insertFirst(3);
		mylist.insertFirst(4);
		mylist.insertFirst(5);
		
		mylist.displayList();
	}

}
