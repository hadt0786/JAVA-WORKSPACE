package com.DataVariableJava;

import java.io.PrintWriter;

public class DataVAriable {
	
	static PrintWriter cout  = new PrintWriter(System.out, true);
	
	public static void main(String [] args)
	{
		int myNumber = 88; 
		Integer num2;
		
		short myShort = 847;
		Short short2 ;
		
		long myLong = 9797;
		Long long2;
		
		double  myDouble = 7.314567;
		Double double2 ;
		
		float myFLoat = 324.4f;
		Float float2;
		
		char myChar = 'y';
		Character char2 ;
		
		boolean myBoolean = false;
		
		Boolean boolean2;
		
		byte myByte = 127;
		
		cout.println(myNumber);
		cout.println(myShort);
		cout.println(myLong);
		cout.println(myDouble);
		cout.println(myFLoat);
		cout.println(myChar);
		cout.println(myBoolean);
		cout.println(myByte/2);
		
		
	}

}
