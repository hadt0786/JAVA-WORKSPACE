package chapter1.ArraysAndString.excercise;

/**
 * String Ritation : Asume you have a methos isSubstring which checks if one word is a substring of another. Given two Strings, S1, s2
 * write code to check if if S2 using only one to isSubstrong(eg "watterbottle" is a rotation of"erbottlewat 
 * */

public class StringRotation {

	boolean isRotation(String s1, String s2) {
		int len = s1.length();
		//check whether the strings s1 and s2 are of equal length and not mpty
		if(len==s2.length()&&len>0) {
			/*Contanetae s 1 and s2*/
			String s1s1=s1 + s1;
			return isSubstring(s1s1, s2);
		}
	}
	
	
}
