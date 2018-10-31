package chapter1.ArraysAndString;

import java.util.ArrayList;

public class ArrayListAndResizeable {

	public ArrayList<String> merge(String[] words, String[]  more){
		ArrayList<String> ans = new ArrayList<>();
		
		for(String w:words) {
			ans.add(w);
		}
		for(String m : more) {
			ans.add(m);
		}
		
		
		return ans;
	}
	
}
