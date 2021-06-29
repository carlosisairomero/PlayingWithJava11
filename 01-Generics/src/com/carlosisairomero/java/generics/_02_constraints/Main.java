package com.carlosisairomero.java.generics._02_constraints;

public class Main {
	
	public static void main(String[] args) {
		
		// List of Integers is ok, because extends from Number
		
		GenericList<Integer> integers = new GenericList<>();
		integers.add(1);
		integers.add(2);
		integers.add(3);
		
		System.out.println(integers.get(0));
		System.out.println(integers.get(1));
		System.out.println(integers.get(2));

		System.out.println();
		
	}
	
}
