package com.cf01.ArrayList;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		// Adding
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);
		
		// Retrieving
		System.out.println(numbers.get(0));
		
		// Indexed for loop iteration		
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));			
		}
		
		System.out.println("\nIteration #2");
		for (Integer value: numbers) {
			System.out.println(value);
		}
		
		// Removing items (careful)
		numbers.remove(numbers.size()-1);
		
		// this is very slow
		numbers.remove(0);
		
		// List interface...
		// List<String> values = new ArrayList<String>();
		
		
	}

}