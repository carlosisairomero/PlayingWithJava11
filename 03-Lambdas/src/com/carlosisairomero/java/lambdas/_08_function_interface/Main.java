package com.carlosisairomero.java.lambdas._08_function_interface;

import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
	
		Function<String, Integer> lambda = str -> str.length();
		Integer length = lambda.apply("Carlos");
		System.out.println("length: " + length);
	}
	
}
