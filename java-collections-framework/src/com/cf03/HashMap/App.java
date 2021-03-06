package com.cf03.HashMap;

import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(5, "five");
		map.put(8, "eight");
		map.put(6, "six");
		map.put(4, "four");
		map.put(2, "two");
		
		// overwrites the value of a key
		map.put(6, "hello");

		String text = map.get(6);
		System.out.println(text);
		
		// iterate through a hashmap
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + ": " + value);
		}
		// hashmaps don't mantain order

	}

}
