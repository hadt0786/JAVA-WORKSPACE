package chapter1.ArraysAndString;

/**
 * Comparision between String and StringBuilder
 * */


public class StringBuildeExample {
	
	String joinWords(String[] words) {
		String sentence ="";
		for(String w: words) {
			sentence+=w;
		}
		return sentence;
		//O(N)--> O(xnsquare)-->n(n+1)/2-->or O(square n)
 	}
	
	String joinWords(String[]words){
		StringBuilder sentence = new StringBuilder();
		for(String w : words) {
			sentence.append(w);
		}
		
		return sentence;
	}

}
