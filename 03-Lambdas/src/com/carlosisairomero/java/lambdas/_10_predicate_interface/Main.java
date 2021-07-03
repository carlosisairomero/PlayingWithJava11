package com.carlosisairomero.java.lambdas._10_predicate_interface;

import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		
		Predicate<String> hasTheAletter = str -> str.contains("A");
		boolean result = hasTheAletter.test("Hello");
		System.out.println(result);
		
	}
	
}
