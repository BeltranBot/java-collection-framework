package com.cf13.complex_data_structures;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class App {

	public static String[] vehicles = { "ambulance", "helicopter", "lifeboat" };

	public static String[][] drivers = { { "fred", "sue", "pete" }, { "sue", "richard", "bob", "fred" },
			{ "pete", "mary", "bob" }

	};

	public static void main(String[] args) {
		Map<String, Set<String>> personnel = new HashMap<String, Set<String>>();
		

		for (int i = 0; i < vehicles.length; i++) {
			String vehicle = vehicles[i];
			String[] driversList = drivers[i];
			Set<String> driverSet = new LinkedHashSet<String>();			
			for (String driver : driversList) {
				driverSet.add(driver);
			}
			personnel.put(vehicle, driverSet);
		}

		{ // brackets just to scope driversList variable so can use again later
			// Example usage
			Set<String> driversList = personnel.get("helicopter");
			for (String driver : driversList) {
				System.out.println(driver);
			}
		}

		// Iterate through whole thing
		for (String vehicle : personnel.keySet()) {
			System.out.print(vehicle);
			System.out.print(": ");
			Set<String> driverList = personnel.get(vehicle);			
			
			for(String driver : driverList) {
				System.out.print(driver);
				System.out.print(" ");
				
			}
			
			System.out.println();
		} 

	}

}
