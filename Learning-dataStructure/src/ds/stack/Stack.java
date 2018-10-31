package ds.stack;

public class Stack {

	private int maxSize;
	private char[] stackArray;
	private int top =-1;

	public Stack(int maxSize) {
		this.maxSize = maxSize;
		this.stackArray = stackArray;
		this.top = top;
	}
	
	public void push(char j) {
		if(isFull()) {
			System.out.println("this stavk is full");
		}
		else {
		top++;
		stackArray[top]=j;
	}
	}
	
	public char pop() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return '0';
		}
		else {
		int old_top = top;
		top--;
		return stackArray[old_top];
	}
	}
	public char peak() {
		return stackArray[top];
	}
	public boolean isEmpty() {
		return (top==-1);
	}
	public boolean isFull() {
		return (maxSize-1==top);
	}
		
	
	
	
}
