package chapter1.ArraysAndString.excercise;

/*
 * Palindrome Strong : check wheter a string is Palindrome
 * Palindrome ia rearrangemnt of letter
 * 
 * Input : Tact Coa
 * Ouptut : true(permutation:"tact cat" , "atco cta", etc)
 * 
 * */
public class PalindromePermutation {
	
	boolean isPermutationOfPalindrome(String phrase) {
		int[] table = buildCharFrequencytable(phrase);
		return checkMaxOneOdd(table);
	}

	/**
	 * check that there no are no more one character has an odd cunt
	 * @param table
	 * @return
	 */
	private boolean checkMaxOneOdd(int[] table) {
		
		boolean foundOdd = false;
		for(int count : table) {
			if(count%2==1) {
			if(foundOdd) return false;
		}
		foundOdd = true;
		}
		return false;
	}
	// check how many times each character appears
	private int[] buildCharFrequencytable(String phrase) {
		int[] table = new int[Character.getNumericValue('z')-Character.getNumericValue('a')+1];
		for(char c : phrase.toCharArray()) {
			int x = getCharNumber(c);
			if(x!=-1) {
				table[x]++;
			}
		}
		
		return table;
	}
	

	/**
	 * Map each character to a number a->0 b->1 .... z->25. This is incase sensitive. Non letter character to -1
	 * @param c
	 * @return
	 */
	private int getCharNumber(char c) {
		int a  = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		
		if(a<=val && val<=z) {
			return val-a;
		}
		
		return -1;
	}

	
	//Time -- O(N) --> 
	
	//Solution 2
	
	boolean isPermutationOdPalindrome2(String phrase) {
		int countOdd = 0;
		int [] table = new int[Character.getNumericValue('z')-Character.getNumericValue('a')+1];
		
		for(char c :phrase.toCharArray()) {
			int x = getCharNumber(c);
			if(x!=-1) {
				table[x]++;
				if(table[x]%2==1) {
					countOdd++;
				}
				else {
					countOdd--;
				}
			}
		}
		return countOdd<=1;
	
	}
	//Solution #3
	
	/**
	 * @param phrase
	 * @return
	 */
	boolean isPermutationofPalindrome(String phrase) {
		int bitVector = createBitVector(phrase);
		return bitVector ==0||checkExactlyOneBitSet(bitVector);
		
		
		
	}

	/**
	 * @param bitVector
	 * @return
	 */
	private boolean checkExactlyOneBitSet(int bitVector) {
		
		
		return (bitVector&(bitVector-1))==0);
	}

	/**
	 * @param phrase
	 * @return
	 */
	private int createBitVector(String phrase) {
		int bitVector = 0;
		for(char c : phrase.toCharArray()) {
			int x = getCharNumber(c);
			bitVector = toggle(bitVector, x);
		}
		
		return bitVector;
	}

	private int toggle(int bitVector, int index) {
		if(index<0) return bitVector;
		
		int mask = 1<<index;
		if((bitVector&mask)==0) {
			bitVector|=mask;
			
		}
		else {
				bitVector&=-mask;
		}
		
		
		return bitVector;
	}
		
}
