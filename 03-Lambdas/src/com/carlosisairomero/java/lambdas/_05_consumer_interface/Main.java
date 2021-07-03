package com.carlosisairomero.java.lambdas._05_consumer_interface;

import java.util.List;

public class Main {

	public static void main(String[] args) {
	
		List<Integer> list = List.of(1,2,3);
		
		// Imperative Programming
		
		System.out.println("Imperative Programming:");
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		// Declarative Programming (using Consumer interface)
		System.out.println("Declarative Programming:");
		list.forEach(System.out::println);
		
	}
	
}
