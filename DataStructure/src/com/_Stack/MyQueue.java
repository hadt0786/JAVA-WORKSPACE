package com._Stack;

import java.util.NoSuchElementException;
import java.util.Queue;

public class MyQueue<T> {

	private static class QueueNode<T> {
		private T data;
		private QueueNode<T> next;
		public QueueNode(T item) {
			this.data = item;
		}

	}
	
	private QueueNode<T> first;
	private QueueNode<T> last;
	
	// add(item) -- check
	public void add(T item) {
		QueueNode<T> t = new QueueNode<T>(item);
		if(last!=null) {
			last.next = t;
		}
		last = t;
		if(first==null) first = last;
	}
	// pop()
	[ub]
	
	// isEmpty()

	// peek()

}