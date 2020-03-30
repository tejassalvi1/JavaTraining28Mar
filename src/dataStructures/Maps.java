package dataStructures;

import java.util.HashMap;
import java.util.Map;

public class Maps {
	
	public static void main(String[] args) {
		// Implement map interfaces
		Map<Integer,String> hmap = new HashMap<Integer,String>();
		mapUtil(hmap);
	}
	
	public static void mapUtil (Map<Integer,String>map) {
			// 1. Add Key-value Pairs
		map.put(210, "Henry");
		map.put(122,"Roger");
		map.put(322, "Stephen");
		map.put(11,"James"); 
		map.put(02, "Bond");
		map.put(98, "Tejas");
		
		// 2. Expose and access elements
		System.out.println("All Key-Value pairs : " +map);
		System.out.println("All Keys : " + map.keySet());
		System.out.println("One value from key : " +map.get(98));
		
		
		//3. Iterate through map of key-value pairs	
		
		for(int key : map.keySet()) {
			System.out.println("[KEY: " + key + " Value : " + map.get(key) + "]");
		}
	}
}
