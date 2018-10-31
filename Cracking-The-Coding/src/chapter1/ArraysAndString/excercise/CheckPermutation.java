package chapter1.ArraysAndString.excercise;

/*
 * Given two strings , write a method to decide one is a permutation of other 
 * 
 * Ask Question --> case sensitive, whitespace is significant
 * */

public class CheckPermutation {

	/**
	 * @param s
	 * @return
	 */
	public String sort(String s) {
		char[] content = s.toCharArray();
		java.util.Arrays.sort(content);

		return new String(content);
	}

	/**
	 * @param s
	 * @param t
	 * @return
	 */
	boolean permuatation(String s, String t) {
		if (s.length() != t.length())
			return false;

		return sort(s).equals(sort(t));
	}

	//solution 2 : check if two String have identical charcater counts
	
	boolean permuation2(String s, String t) {
		if(s.length()>t.length()) return false;
		
		int[] letters = new int[128]; //Assumption
		
		char[] s_array = s.toCharArray();
		for(char c : s_array) {
			//count number of each chracter in each char in s
			letters[c]++;
		}
		for(int i = 0; i<t.length();i++) {
			int c = (int) t.charAt(i);
			letters[c]--;
			if(letters[c]<0 ) {
				return false;
			}
			return true;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
