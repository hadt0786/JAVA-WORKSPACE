package ds.doublyLinkedList;

public class App {
	public static void main(String[] args) {
		DoublyLinkedList dl =new DoublyLinkedList();
		dl.insertFirst(22);
		dl.insertFirst(33);
		dl.insertFirst(44);
		
		dl.insertlast(55);
		dl.insertlast(66);
		dl.insertlast(77);
		
		dl.displayForward();
		dl.dispalyBackward();
		
		dl.deleteFirst();
		dl.deleteLast();
		dl.deleteKey(11);
		
		dl.dispalyBackward();
		dl.displayForward();
		
		dl.insertAfter(22, 77);
		dl.insertAfter(33, 88);
		
		dl.displayForward();
		
	}
}
