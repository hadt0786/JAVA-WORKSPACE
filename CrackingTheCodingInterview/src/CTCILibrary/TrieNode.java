package CTCILibrary;

import java.util.HashMap;

/**
 * One Node in the trie. Most of the trie is implemented in this class
 * 
 * */


public class TrieNode {

	/* The children of the node in the trie */
	
	private HashMap<Character, TrieNode> children;
	private boolean terminates = false;
	
	// The character stored in this node as data
	
	private char character;
	
	
	
}

