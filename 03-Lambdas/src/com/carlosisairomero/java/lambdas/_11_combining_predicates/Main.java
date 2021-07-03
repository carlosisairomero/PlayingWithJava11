package com.carlosisairomero.java.lambdas._11_combining_predicates;

import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		
		boolean result = false;

		Predicate<String> hasLeftBrace = str -> str.startsWith("{");
		Predicate<String> hasRightBrace = str -> str.endsWith("}");
		
		// Logical &&:
		
		result = hasLeftBrace.and(hasRightBrace).test("{Hello}");
		System.out.println(result);

		result = hasLeftBrace.or(hasRightBrace).test("{Hello");
		System.out.println(result);

		result = hasLeftBrace.negate().test("{Hello");
		System.out.println(result);
	}
	
}
