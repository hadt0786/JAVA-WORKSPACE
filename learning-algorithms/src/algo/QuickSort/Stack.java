package algo.QuickSort;

class MyStack {
	char[] a = new char[100];
	int top = -1;
	
	void push(char c) {
		a[++top] = c;
	}
	public char pop() {
		return a[top--];
	}
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	public char peek() {
		return a[top];
	}
}
