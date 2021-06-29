package com.carlosisairomero.java.generics._01_basics;

public class Main {
	
	public static void main(String[] args) {
		
		// List of Integers
		
		GenericList<Integer> integers = new GenericList<>();
		integers.add(1);
		integers.add(2);
		integers.add(3);
		
		System.out.println(integers.get(0));
		System.out.println(integers.get(1));
		System.out.println(integers.get(2));

		System.out.println();
		
		// List of Strings
		
		GenericList<String> strings = new GenericList<>();
		strings.add("One");
		strings.add("Two");
		strings.add("Three");
		
		System.out.println(strings.get(0));
		System.out.println(strings.get(1));
		System.out.println(strings.get(2));
		
		System.out.println();
		
		// List of Strings
		
		GenericList<User> users = new GenericList<>();
		users.add(new User("Michael Jackson", 20));
		users.add(new User("Beyonce", 30));
		users.add(new User("Will Smith", 40));
		
		System.out.println(users.get(0));
		System.out.println(users.get(1));
		System.out.println(users.get(2));
		
		
	}
	
}
