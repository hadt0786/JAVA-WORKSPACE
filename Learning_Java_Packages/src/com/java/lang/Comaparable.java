package com.java.lang;

public interface Comaparable<T> {
	
	public int compareTo(T o) throws NullPointerException, ClassCastException;
//	a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object.


}
