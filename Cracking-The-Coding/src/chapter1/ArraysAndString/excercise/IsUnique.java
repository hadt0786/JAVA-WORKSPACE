package chapter1.ArraysAndString.excercise;

/**
 *Implement an Algorithm to determine if a string has all unique characters. WHat if 
 *you can't use the data structure
 *
 * Ask Question --> ASCII or UNICODE String
 * */


public class IsUnique {
\
	
	/**
	 * @param str
	 * @return
	 */
	public boolean isUniqueChars(String str) {
		if(str.length() >128) return false; 
		
		boolean [] charSet = new boolean[128];
		for(int i =0; i<str.length();i++) {
			int val = str.charAt(i);
			if(charSet[val]) {
				return false;
			}
			charSet[val] = true;
			
		}
		return true;
	}
	//time Complexity is O(N) -- > length of the str
	//space com -- O(1)

	public boolean isUniqueChars2(String str) {
		int checker = 0;
		for(int i =0; i<str.length();i++) {
			int val = str.charAt(i);
			System.out.println(1<<val);
			if((checker & (1<<val))>0) return false;
			checker |=(1<<val);
			System.out.println(checker);
		}
		return true;
	}

}




