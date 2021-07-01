package com.carlosisairomero.java.collections._07_set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		// Set: unique values.
		
		// Union (not repeated)

		Set<String> set1 = new HashSet<String>(
				Arrays.asList("a", "b", "c"));
		Set<String> set2 = new HashSet<String>(
				Arrays.asList("c", "d", "e"));
		
		System.out.println("set1: " + set1);
		System.out.println("set2: " + set2);
		set1.addAll(set2);
		System.out.println("Union (not repeated): " + set1);

		System.out.println("==========================================");
		
		// Intersection 
		
		Set<String> set3 = new HashSet<String>(
				Arrays.asList("a", "b", "c"));
		Set<String> set4 = new HashSet<String>(
				Arrays.asList("c", "d", "e"));
		
		System.out.println("set3: " + set3);
		System.out.println("set4: " + set4);
		set3.retainAll(set4);
		System.out.println("Intersection: " + set3);
		
		System.out.println("==========================================");
		
		// Difference
		
		Set<String> set5 = new HashSet<String>(
				Arrays.asList("a", "b", "c"));
		Set<String> set6 = new HashSet<String>(
				Arrays.asList("c", "d", "e"));
		
		System.out.println("set5: " + set5);
		System.out.println("set6: " + set6);
		set5.removeAll(set6);
		System.out.println("Difference: " + set5);
		
}
	
}
