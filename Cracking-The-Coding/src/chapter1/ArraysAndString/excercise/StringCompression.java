package chapter1.ArraysAndString.excercise;

/**
 * implement a method to perform basic string compression using the counts of repeated characters.
 * Example : aabcccccaaa would become a2 b1c5a3. if the compressedstrong would not become smaller than the original string your method should return the original string 
 * Assume that only uppercase and lowercase letter (a-z)
 * */


public class StringCompression {

	String compress(String str) {
/*		check final length and return input string if it would be longer*/
		int finalLength = countCompression(str);
		if(finalLength >=str.length()) return str;
		
		StringBuilder compressed = new StringBuilder(finaLength); //initial capacity
		int countConsecutive =0;
		for(int i =0 ; i<str.length();i++) {
			/*if next character is different from current append it,  */
		if(i+1 >=str.length()|| str.charAt(i)!=str.charAt(i+1)) {
			compressed.append(str.charAt(i))
		}
		
		
		}
	
	}
	
	
}
