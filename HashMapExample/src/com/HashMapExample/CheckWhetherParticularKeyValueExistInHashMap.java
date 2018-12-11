package com.HashMapExample;

import java.util.HashMap;

/*5) How do you check whether a particular key/value exist in a HashMap?
* Using containsKey() and containsValue() methods.


*/

public class CheckWhetherParticularKeyValueExistInHashMap {

	public static void main(String[] args) {

		// Creating the HashMap
		HashMap<Integer, Double> map = new HashMap<>();

		// Adding key-value pairs to HashMap

		map.put(1, 1.1);
		map.put(2, 2.1);
		map.put(3, 3.3);
		map.put(4, 4.1);
		map.put(5, 5.1);

		// Checking whether key '3' exist in map

		System.out.println(map.containsKey(3)); // Output : true

		// Checking whether value '3.3' exist in map

		System.out.println(map.containsValue(3.3)); // Output : true

	}

}
