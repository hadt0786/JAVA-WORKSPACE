package com.Stack;

public class QueueTwoStack<T> {
	
	private Stack<T> forwardStack = new Stack<>();
	private Stack<T> reverseStack = new Stack<>();
	
	public QueueTwoStack() {
		
	}
	public boolean isFull() {
		return forwardStack.isFull()||reverseStack.isEmpty();
	}
	public boolean isEmpty() {
		return forwardStack.isEmpty()&&reverseStack.isEmpty();
	}
	public void enqueue(T data) throws QueueOverflowException{
		if(isFull()) {
			throw new Queue.QueueOverflowException();
		}
		try {
			if(forwardStack.isEmpty()) {
				while(!reverseStack.isEmpty()) {
					forwardStack.push(reverseStack.pop());
				}
			}
			forwardStack.push(data);
		}
		catch(Stack.StackOverflowExcepton) {
			throw new Queue.QueueOverflowException();
		}
	}
	public T dequeue() throws Queue.QueueUnderflowException{
		if(isEmpty()) {
			throw new Queue.QueueUnderflowExcetpion();
		}
		try {
			if(reverseStack.isEmpty()) {
				while(!forwardStack.isEmpty()) {
					reverseStack.push(forwardStack.pop());
				}
			}
			return reverseStack.pop();
		}
		catch(Stack.StackOverflowException) {
			throw new Queue/QueueUnderflowexception();
		}
	}

}
