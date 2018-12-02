package com.java.lang;

public interface ICharSequence {
	
	public char charAt(int index) throws IndexOutOfBoundsException ; // if the index argument is negative or not less than length()	
	
	public int length();
	
	public CharSequence subSequence(int start, int end); // if start or end are negative, if end is greater than length(), or if start is greater than end
	
	public String toString(); // toString in class Object

}
