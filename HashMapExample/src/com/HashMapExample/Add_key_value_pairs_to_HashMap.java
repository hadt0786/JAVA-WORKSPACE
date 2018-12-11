package com.HashMapExample;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 * By using put() and putAll() methods. put() method adds key-value pair one by
 * one where as putAll() method copies all key-value pairs from one HashMap to
 * another HashMap
 **/

public class Add_key_value_pairs_to_HashMap {

	public static void main(String[] args) {
		// Creating HashMap with default initial capacity and load factor

		HashMap<String, Integer> map = new HashMap<>();
		// Inserting key-value pairs to map using put() method

		map.put("ONE", 1);
		map.put("TWO", 2);
		map.put("THREE", 3);
		map.put("FOUR", 4);
		map.put("FIVE", 5);

		// Printing key-value pairs

//	Set<Entry<String, Integer>> entrySet = map.entrySet();
		Set<Entry<String, Integer>> entrySet = map.entrySet();

		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		System.out.println("-------------------------");

		// Creating another HashMap

		HashMap<String, Integer> anotherMap = new HashMap<>();

		// Inserting key-value pairs to anotherMap using put() method

		anotherMap.put("SIX", 5);
		anotherMap.put("SEVEN", 6);

		// Inserting key-value pairs of map to anotherMap using putAll() method

		anotherMap.putAll(map);
		// Printing key-value pairs of anotherMap

		entrySet = anotherMap.entrySet();

		for (Entry<String, Integer> entry1 : entrySet) {
			System.out.println(entry1.getKey() + " : " + entry1.getValue());
		}

	}
}