import java.lang.*;
import java.util.*;

//package com.Stack;

public class Paranthesis {
	private static final Map<Character, Character> matchingParentMap  = new HashMap<>(); 
	private static final Set<Character> openingParentSet=new HashSet<>();
	static {
		matchingParentMap.put(')','(');
		matchingParentMap.put(']','[');
		matchingParentMap.put('}','{');
		openingParentSet.addAll(matchingParentMap.values());
		
	}
	public static boolean hasMatchingParens(String input) {
		try {
			Stack<Character> parentStack = new Stack<>();
			
			for(int i=0; i<input.length();i++){
				char ch = input.charAt(i);
				
				if(openingParentSet.contains(ch)) {
					parentStack.push(ch);
				}
				if(matchingParentMap.containsKey(ch)) {
					Character lastparen = parentStack.pop();
					if(lastparen !=matchingParentMap.get(ch)) {
						return false;
					}
					
				}
			}
		//	Map<Character, Character> parenStack;
			return parenStack.isEmpty();
			
		}catch (Stack.StackOverflowError soe) {System.err.println("Stack overflow);
	}catch(Stack.StackUnderflowException sue) { System.err.println("Stack underflow);
}
}
	return false;
}