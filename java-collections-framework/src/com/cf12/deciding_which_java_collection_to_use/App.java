package com.cf12.deciding_which_java_collection_to_use;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class App {
	public static void main(String[] args) {
		/*
		 * Consider: 1. what you need the collection to do 2. are you using the
		 * fastest collection for your purposes (think about insertion/deletion,
		 * retrieval and traversal)
		 */

		//////////////// LISTS ///////////////////////////
		// Store lists of objects
		// Duplicates are allowed
		// Objects remain in order
		// Elements are indexed via an integer
		// cf. shopping list
		// Checking for particular item in list is slow
		// Looking an item up by index is fast
		// Iterating through lists is relatively fast
		// Note: you can sort lists if you want to

		// If you only add or remove items at end of list, user ArrayLists
		List<String> list1 = new ArrayList<String>();

		// Removing or adding items elsewhere in the lists?
		List<String> list2 = new LinkedList<String>();

		///////////////// SETS ///////////

		// Only store unique values
		// Great for removin duplicates
		// not indexed, unlike lists
		// very fast to check if a particular object exists
		// if you want to use your own objects, you must implement hashCode()
		// and equals
		
		// order is unimportant and ok if it changes?
		// hashset is not ordered.
		Set<String> set1 = new HashSet<String>();
		
		// Sorted in natural order ? use treeset - must implement comparable for your own objects
		// (1,2,3 ... , a, b, c, .... etc)
		
		Set<String> set2 = new TreeSet<String>();
		
		// Elements remain in the order they were added
		Set<String> set3 = new LinkedHashSet<String>();
		
		/////////////////// MAPS ///////////////
		
		// key value paris
		// like lookup tables
		// retrieving a value by key is fast
		// iterating over map values is very slow
		// maps not really  optimised for iteration
		// if you want to use your own objects as keys, you must implement hashCode() and equals()
		
		// keys not in any particular order, and order liable to change
		Map<String, String> map1 = new HashMap<String, String>();
		
		// Keys sorted in natural order - must implement comparable for custome maps
		Map<String, String> map2 = new TreeMap<String, String>();
		
		// keys remain in order added
		Map<String, String> map3 = new LinkedHashMap<String, String>();
		
		// There are also the sortedset and sortedmap interfaces
		
		
	}

}
