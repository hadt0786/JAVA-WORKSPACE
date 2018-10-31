package com._02_LinkedList;

import java.util.Stack;

public class Palindrome {

	static Node link;
	
	Stack test = new Stack();

	public 
	
	link.appenToTail(1);link.appenToTail(2);link.appenToTail(3);link.appenToTail(3);link.appenToTail(2);link.appenToTail(1);

	Node slow = head;
	Node fast = head;

	while(slow.next!=null)
	{
		test.push(slow.value);
		slow = slow.next;
		fast = fast.next.next;
		System.out.println(test.pop() + " stack value");
		System.out.println(slow.value + " slow value ");
		System.out.println(fast.value + " fast value");

	}

}

}
