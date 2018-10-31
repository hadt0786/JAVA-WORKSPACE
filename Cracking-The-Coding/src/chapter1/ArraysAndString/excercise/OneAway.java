package chapter1.ArraysAndString.excercise;
/**
 * There are Three types of edit that can be performed on strings, insert,remove,replace a character 
 * Given two strings write a function to check if they are one edit (oe zero edits)
 * 
 * Consider two strings pale and bale
 * 
 * Replacements -- Pale and bale are one replacement away, replae a character in bale to make pale
 * 
 * Insertions : The string apple and aple are one insertion away. This means if you conpared the strings they are identical
 * , except for a one shift at some points in the strings
 * 
 * Removal : The Strings apple and aple are also one removal away, since removal is just the inverse of insertion 
 * 
 * 
 * Example : 
 * pale, ple-->true
 * 
 * pales, pale-->true
 * 
 * pale, bale-->true
 * 
 * pale, bale-->false
 * */


public class OneAway {

	/**
	 * @param first
	 * @param second
	 * @return
	 */
	boolean oneEditAway(String first, String second) {

		if(first.length()==second.length()) {
			return oneEditReplace(first, second);
		}else if(first.length()+1==second.length()) {
			return oneEditInsert(first, second);
		}else if(first.length()-1==second.length()) {
			return oneEditInsert(first, second);
		}

		return false;
	}

	/**
	 * @param first
	 * @param second
	 * @return
	 */
	private boolean oneEditReplace(String first, String second) {

		boolean foundDifference = false;
		for(int i =0 ; i<first.length();i++) {
			if(first.charAt(i)!=second.charAt(i)) {
				if(foundDifference) return false;

				foundDifference = true;
			}

		}

		return true;
	}

	/*check if you insert a charcater into s1 to make s2*/
	private boolean oneEditInsert(String s1, String s2) {
		
		int index1 = 0;
		int index2 = 0;
		
		while(index2 <s2.length() && index1<s1.length()) {
			if(s1.charAt(i)!=s2.charAt(index2)) {
				if(index1 !=index2) {
					return false;
				}
				index2++;
			}
			else {
				index1++;
				index2++;
			}
		}
		
		return true;
	}





















}
