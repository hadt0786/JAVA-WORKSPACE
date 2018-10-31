package adt;

public class Counter {

	String name = null;
	int value = 0;
	
	public Counter(String name) {
		super();
		this.name = name;
	}
	
	public void increment() {
		value++;
	}
	
	public int getCurrentvalue() {
		return value;
	}
	
	public String toString() {
		return name+": "+value;
	}
	
}
