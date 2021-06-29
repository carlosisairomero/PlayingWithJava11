package com.carlosisairomero.java.generics._06_wildcards;

import java.util.List;

public class Utils {

	// This method will work only with a list of Person
	public static void printAsUsually(List<Person> list) {
		for (Person person : list) {
			System.out.println(person);
		}
	}
	
	// This method will work with both: Person and Worker
	public static void printAsWildcard(List<? extends Person> list) {
		for (Person person : list) {
			System.out.println(person);
		}
	}
	
}
