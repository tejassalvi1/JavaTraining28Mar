package dataStructures;

import java.util.HashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		
		// Hash Set - Inserts the value in the random order
		// LinkedHash Set - Inserts the value in the order they were entered
		// Tree Set - Rearranges to Natural Order.
		
		// 1. Define the collection
		Set <String> animals = new HashSet<String>(); // Hash set does not allow Duplicates
		
		animals.add("Tiger");
		animals.add("Lion");
		animals.add("Dog");
		animals.add("Cow");
		animals.add("Pig");
	//	System.out.println(animals.size() + " " + animals);
		
		animals.add("Lion");
		animals.add("Dog");
		animals.add("Cow");
		
		animals.add("Buffalo");
		animals.add("Giraffe");
		
		System.out.println(animals.size() + " " + animals);
		
		
		//2. Creating the new set that will use for comparison
		
		Set <String> farmAnimals = new HashSet<String>();
		
		farmAnimals.add("Cow");
		farmAnimals.add("Buffalo");
		farmAnimals.add("Dog");
		farmAnimals.add("Camel");
		farmAnimals.add("Cat");
		
		System.out.println(farmAnimals.size() + " " + farmAnimals);
		
		//3. What is Intersection between animals and farmAnimals
		// I. Copy the existing set into the new set
		
		Set<String>intersectionSet =  new HashSet<String>(animals);
		//System.out.println(IntersectionSet);
		
		// II. Retain only the elements that are also in the other set
		intersectionSet.retainAll(farmAnimals);
		System.out.println("The Intersection is : " + intersectionSet);
		
		// What is union
		
		Set<String> unionSet = new HashSet<String>(farmAnimals);
		unionSet.addAll(animals);
		System.out.println("The union is: " + unionSet);
		}
}
