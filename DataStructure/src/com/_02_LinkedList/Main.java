package com._02_LinkedList;

public class Main {


	public static void main(String[] args) {
		
		LinkedDemo test = new LinkedDemo();
		
		Node temp = new Node(0);
		for (int i = 1; i < 10; i++) {
			temp.appenToTail(i);
		}
		
		test.palindrome(temp);
		
		test.display(temp);
		System.out.println();
		//test.display(test.removefromLast(5, temp));
		
		//System.out.println(test.removefromLast(5, temp).value);

		//System.out.println(test.removefromLast(5, temp).value);
		
		//test.display(test.partition(temp, 5));

		//System.out.println(9%10);
		
		
		
		// System.out.println(test.removefromLast(k, ));
	}
	

	

}
