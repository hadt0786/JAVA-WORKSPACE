package adt;

import java.util.LinkedList;

public class App {

	//Abstract data type is black container/box
	public static void main(String[] args) {
		Counter myCounter = new Counter ("myCounter");
		myCounter.increment();
		myCounter.increment();

		myCounter.increment();

		myCounter.increment();
		
		System.out.println(myCounter.getCurrentvalue());
		
		//LinkedList app = new LinkedList();
	
	}
	
}
