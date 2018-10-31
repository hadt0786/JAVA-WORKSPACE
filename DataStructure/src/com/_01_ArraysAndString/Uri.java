package com._01_ArraysAndString;

/*
 * Test case : "Mr John Smith   ", 13
 * Output : "Mr%20John%Smith"
 * **/


public class Uri {
	
	static final char space = ' ';
	
	static final String swap = "%20";
	
	public static void main(String[] args) {
		
		String test = "Mr John Smith  ";
		int givenStringLength = 13;
		
		String[] split = test.split(" ");
		String line = "";
		for(int i =0 ;i<split.length;i++) {
			line+="%20"+split[i];
		}
		for(int j = 3;j<line.length();j++) {
			System.out.print(line.charAt(j));
			
		}
		
		
		
	}
}
