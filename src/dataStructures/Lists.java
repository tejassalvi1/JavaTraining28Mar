package dataStructures;

import java.util.ArrayList;

public class Lists {
	public static void main(String[] args) {
		// create a collection
		ArrayList<String> cities = new ArrayList<String>();
		
		// Add some Elements
		cities.add("Indore");
		cities.add("Mumbai");
		cities.add("Pune");
		cities.add("Chennai");
		cities.add("Delhi");
		cities.add("Banglore");
		
		// Iterate the Collection
		for (String city : cities) {
			System.out.print(city + " ");
		}
		
		// Get the size
		int size =cities.size();
		System.out.println("\nThere are "+size +" elements in the array" );
	
	
		// Retrieve Specific element
		String citi = cities.get(0);
		System.out.println("\n" +citi);
		
		// Remove the Element
		System.out.println(cities.remove(3));
		System.out.println("There are " + cities.size() +" elements in the array");
		System.out.println(cities);
		
		for (String city : cities) {
			System.out.print(city + " ");
		}
}
}