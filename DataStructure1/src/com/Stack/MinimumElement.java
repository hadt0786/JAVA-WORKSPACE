package com.Stack;

public  class MinimumElement {
	
	//find the minimum element in a stack in constant time
	
	private Stack<Integer> stack = new Stack<>();
	private Stack<Integer> minimumStack = new Stack<>();
	
	public void push(int data) throws Stack.StackOverflowException,
									  Stack.StackUnderflowException{
		int min = data;
		if(!minimumStack.isEmpty()) {
			if(min>minimumStack.peek()) {
				min = minimumStack.peek();
			}
		}
		stack.push(data);
		minimumStack.pop();
		mimumStack.push(min);
	}
	public int pop() throw Stack.StackUnderflowException{
		mimumStack.pop();
		return stack.pop();
	}
	public int getMimum() throws Stack.StackunderflowException{
		return minimumStack.peek();
		
	}
 	
	
}
